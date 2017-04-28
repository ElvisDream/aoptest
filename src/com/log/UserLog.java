package com.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Elivs on 2017/3/13.
 */
@Component("userLog")
@Aspect
public class UserLog {

    SimpleDateFormat smp = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
    Date now = new Date();

    @Pointcut("execution(* com.service.UserService.*(..))")
    public void pointCut(){}

    public void getTime() {//获取当前详细日期信息
        String nowdate = smp.format(now);
        System.out.print(nowdate+" ");
    }

    @Around("pointCut()")
    public String userLog(ProceedingJoinPoint user) throws Throwable {
        System.out.println("用户日志信息:");
        Object object = user.proceed();
        getTime();
        System.out.println(object+" "+user.getSignature().getName());
        return (String)object;
    }
    public void userTest(String userName) {
        System.out.println(userName);
    }
}