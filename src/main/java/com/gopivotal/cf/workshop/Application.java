package com.gopivotal.cf.workshop;

import org.springframework.boot.SpringApplication;
/**
 * Used to initialize the app when packaged as a JAR
 * @author kkrueger
 * Hello
 * another
 */
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }
    
}
