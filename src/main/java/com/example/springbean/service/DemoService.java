package com.example.springbean.service;

import com.example.springbean.model.ProfileModel;

public class DemoService {

    private ProfileModel profileModel;

    public DemoService() {
        System.out.println("No args constructor");
    }

    public DemoService(ProfileModel profileModel) {
        System.out.println("Args constructor");
        this.profileModel = profileModel;
    }

    public void setProfileModel(ProfileModel profileModel) {
        this.profileModel = profileModel;
    }

    @Override
    public String toString() {
        return "Name = " + profileModel.getName();
    }
}
