package com.itvaib.ioc;

import com.itvaib.ioc.service.CoachService;
import com.itvaib.ioc.service.impl.BaseBallCoach;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocDemoApplication {


	static Logger logger = LoggerFactory.getLogger(IocDemoApplication.class.getName());

	// Craeting an application context object which hold
	// all the detail relted to spring container
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		// Assign the application context
		applicationContext = SpringApplication.run(IocDemoApplication.class, args);
		displayAllBeansName();
		// Here baseBallCoach is the bean id that we alredy define in BaseBallCoach Service
		CoachService coachService = applicationContext.getBean("myBaseBallCoach", BaseBallCoach.class);
		logger.info(coachService.getDailyWorkOut());

	}

	/**
	 * Getting all the beans that is craeted by Spring
	 * as you can see in console log baseBallCoach also there
	 */
	public static void displayAllBeansName(){
		String [] beanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : beanNames){
			logger.info("Bean Name: "+ beanName);
		}
	}

}
