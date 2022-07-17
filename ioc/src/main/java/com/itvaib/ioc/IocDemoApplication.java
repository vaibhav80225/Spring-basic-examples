package com.itvaib.ioc;

import com.itvaib.ioc.service.CoachService;
import com.itvaib.ioc.service.impl.BaseBallCoach;
import com.itvaib.ioc.service.impl.TrachCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocDemoApplication {

	private static ApplicationContext applicationContext;
	@Autowired
	private BaseBallCoach baseBallCoach;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(IocDemoApplication.class, args);
		CoachService coachService = applicationContext.getBean("baseBallCoach", BaseBallCoach.class);
		CoachService coachService1 = new TrachCoach();
		System.out.println(coachService.getDailyWorkOut());
		System.out.println(coachService1.getDailyWorkOut());

	}

}
