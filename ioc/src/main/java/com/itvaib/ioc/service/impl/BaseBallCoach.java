package com.itvaib.ioc.service.impl;

import com.itvaib.ioc.service.CaptainService;
import com.itvaib.ioc.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Creating an Object which is managed by spring container
// here I provided the bean id explicitly.. added annotation so bean can register it
@Component("myBaseBallCoach")
public class BaseBallCoach implements CoachService {

    private CaptainService captainService;

    // Configure a dependency using autowired annotation
    @Autowired
    public BaseBallCoach(@Qualifier("baseBallCaptain") CaptainService captainService) {
        this.captainService = captainService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 Minute on batting practice";
    }

    public String getCaptainName(){
        return "captain name is: " +captainService.getCaptainName();
    }
}
