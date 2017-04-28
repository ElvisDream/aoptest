package com.controller;

import org.apache.log4j.Logger;

/**
 * Created by Elivs on 2017/3/13.
 */
public class LogTest {
    private static Logger logger = Logger.getLogger(LogTest.class);

    public static void main(String[] args) {

        logger.debug("asdf");
    }
}
