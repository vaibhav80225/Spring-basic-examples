package com.itvaib.ioc.service.impl;

import com.itvaib.ioc.service.CaptainService;
import com.itvaib.ioc.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Creating an Object which is managed by spring container
// Here I am not passing bean id so spring automatically create one for us
// and bydefualt spring follow camelcase for bean id ex - TrackCoach = trackCoach
@Component
public class TrackCoach implements CoachService {

    private CaptainService captainService;
    // Setter Injection
    @Autowired
    public void setCaptainService(CaptainService captainService) {
        this.captainService = captainService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Run Hard 5 KM";
    }

    public String getCaptain(){
        return captainService.getCaptainName();
    }



}
