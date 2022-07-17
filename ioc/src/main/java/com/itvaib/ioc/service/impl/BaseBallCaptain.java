package com.itvaib.ioc.service.impl;

import com.itvaib.ioc.service.CaptainService;
import org.springframework.stereotype.Service;

@Service
public class BaseBallCaptain implements CaptainService {
    @Override
    public String getCaptainName() {
        return "Mr. Rajender";
    }
}
