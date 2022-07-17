package com.itvaib.ioc.service.impl;

import com.itvaib.ioc.service.CaptainService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TrackCaptain implements CaptainService {
    @Override
    public String getCaptainName() {
        return "Captain name is: My name";
    }
}
