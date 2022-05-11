package com.xtl.other;

import java.util.logging.Logger;

/**
 * @author 31925
 * @className Hello
 * @description TODO
 * @date 2022/5/10 17:00
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");
        Logger logger = Logger.getLogger(Hello.class.getName());
        logger.info("hello");
    }
}
