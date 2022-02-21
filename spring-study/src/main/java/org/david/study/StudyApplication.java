package org.david.study;

import org.david.study.model.User;
import org.david.study.service.UserService;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author david
 */
public class StudyApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		GenericApplicationContext genericApplicationContext= new GenericApplicationContext();
		new XmlBeanDefinitionReader(genericApplicationContext).loadBeanDefinitions("services.xml","daos.xml");
		genericApplicationContext.refresh();
		UserService userService = context.getBean("userService", UserService.class);
		userService.addUser(new User(1L, "David"));
	}
}