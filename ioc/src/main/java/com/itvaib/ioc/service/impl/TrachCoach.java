package com.itvaib.ioc.service.impl;

import com.itvaib.ioc.service.CoachService;

public class TrachCoach implements CoachService {
    @Override
    public String getDailyWorkOut() {
        return "Run Hard 5 KM";
    }
}
