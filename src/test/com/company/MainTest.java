package test.com.company;

import com.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testMain() throws Exception {

        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
//        userService.addUser();
        userService.login("zhang3");
    }
}
