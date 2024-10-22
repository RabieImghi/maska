package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        try {
            jdbcTemplate.execute("SELECT 1");
            System.out.println("Connected to the database.");
        } catch (Exception e) {
            System.err.println("Not connected to the database: " + e.getMessage());
        }
    }
}
