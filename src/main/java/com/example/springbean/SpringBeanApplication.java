package com.example.springbean;

import com.example.springbean.config.AppConfig;
import com.example.springbean.model.ProfileModel;
import com.example.springbean.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBeanApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        DemoService demoService = applicationContext.getBean("demoService", DemoService.class);

        demoService.setProfileModel(new ProfileModel("Simon"));

        System.out.println(demoService.toString());
    }

}
