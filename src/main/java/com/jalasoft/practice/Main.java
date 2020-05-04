/**
 * File: Main.java
 * Copyright (c) 2020 Jalasoft.
 *
 * This software is the confidential and propietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 * */
package com.jalasoft.practice;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

/**
 * Start the spring service and call to the HelloController cllas
 *
 * @author Alexander Apaza
 * @version 1.0
 *
 */
@SpringBootApplication
public class Main {
    /**
     * Main service starter
     *
     * @author Alexander Apaza
     * @version 1.0
     *
     */
    public static void main(String[] args) {
        System.out.println("Hello!!!");
        SpringApplication.run(Main.class, args);
    }
}