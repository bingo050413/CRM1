package cn.bdqn.test;


import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.entities.User;

public class TestBean {
	@Test
	public void test(){
		//创建IOC容器
	ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
	User user  = (User) context.getBean("user");
	//User user = context.getBean(User.class);
	System.out.println(user);
	}
	@Test
	public void test2() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		DataSource dataSource = (DataSource)context.getBean("dataSource");
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
}
}
