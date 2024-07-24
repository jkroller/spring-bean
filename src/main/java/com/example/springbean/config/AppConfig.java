package com.example.springbean.config;

import com.example.springbean.model.ProfileModel;
import com.example.springbean.service.DemoService;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public DemoService demoService() {
        return new DemoService(profileModel());
    }

    @Bean
    public ProfileModel profileModel(){
        ProfileModel profileModel = new ProfileModel();
        profileModel.setName("lnw Simon");
        profileModel.setAge("25");
        return profileModel;
    }

}
