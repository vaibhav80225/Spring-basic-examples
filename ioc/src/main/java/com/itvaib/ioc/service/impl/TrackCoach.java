package com.itvaib.ioc.service.impl;

import com.itvaib.ioc.service.CoachService;
import org.springframework.stereotype.Component;

// Creating an Object which is managed by spring container
// Here I am not passing bean id so spring automatically create one for us
// and bydefualt spring follow camelcase for bean id ex - TrackCoach = trackCoach
@Component
public class TrackCoach implements CoachService {
    @Override
    public String getDailyWorkOut() {
        return "Run Hard 5 KM";
    }
}
