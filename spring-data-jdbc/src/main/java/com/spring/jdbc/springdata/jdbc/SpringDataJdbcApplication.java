package com.spring.jdbc.springdata.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude={SqlInitializationAutoConfiguration.class})
public class SpringDataJdbcApplication {

    private final ApplicationContext applicationContext;

    public SpringDataJdbcApplication(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
      SpringApplication.run(SpringDataJdbcApplication.class, args);


    }

    CommandLineRunner commandLineRunner(){
        for (var bean : applicationContext.getBeanDefinitionNames()){
            System.out.println("bean = " + bean);
        }
        return null;
    }

}
