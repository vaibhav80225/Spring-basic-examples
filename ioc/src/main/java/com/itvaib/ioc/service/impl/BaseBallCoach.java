package com.itvaib.ioc.service.impl;

import com.itvaib.ioc.service.CoachService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("baseBallCoach")
public class BaseBallCoach implements CoachService {

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 Minute on batting practice";
    }
}
