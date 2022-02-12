package org.david.study;

import org.david.study.config.AppConfig;
import org.david.study.model.User;
import org.david.study.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author david
 */
public class StudyApplication {
	public static void main(String[] args) {
		ApplicationContext context = null;
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserService userService = context.getBean(UserService.class);
//		userService.addUser(new User(0L,"David"));

		context = new ClassPathXmlApplicationContext("application.xml");
		User user = context.getBean(User.class);
		System.out.println("user = " + user);
	}
}
