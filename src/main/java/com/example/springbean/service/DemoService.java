package com.example.springbean.service;

import com.example.springbean.model.ProfileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private ProfileModel profileModel;

    public DemoService() {
        System.out.println("No args constructor");
    }

    public DemoService(ProfileModel profileModel) {
        System.out.println("Args constructor");
        this.profileModel = profileModel;
    }

    @Autowired
    public void setProfileModel(ProfileModel profileModel) {
        this.profileModel = profileModel;
    }

    @Override
    public String toString() {
        return "Name = " + profileModel.getName();
    }
}
