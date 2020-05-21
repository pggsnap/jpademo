package me.pggsnap.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author pggsnap
 * @date 2020/5/1
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.setProperty("hibernate.dialect.storage_engine", "innodb");
        SpringApplication.run(Application.class, args);
    }
}
