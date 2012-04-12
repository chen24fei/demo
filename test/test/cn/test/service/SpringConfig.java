package cn.test.service;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.test.domain.User;

public class SpringConfig {
	private static ApplicationContext ac = null;

	@BeforeClass
	public static void before() {
		try {
			ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			System.out.println(ac);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	@Test
	public void testIsertUser(){
		UserService userservice = (UserService)ac.getBean("userService");
		User user = new User();
		user.setEmail("xx@xc.cn");
		user.setNickName("xxxxx");
		userservice.saveEntity(user);
	}
}
