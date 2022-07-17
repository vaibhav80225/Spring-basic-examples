package com.itvaib.ioc.service.impl;

import com.itvaib.ioc.service.CoachService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Creating an Object which is managed by spring container
// here I provided the bean id explicitly
@Component("myBaseBallCoach")
public class BaseBallCoach implements CoachService {

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 Minute on batting practice";
    }
}
