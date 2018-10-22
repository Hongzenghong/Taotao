package com.hzh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// 創建HelloWorld的一个对象
		// HelloWorld helloWorld = new HelloWorld();
		// 为name属性赋值
		// helloWorld.setName("Hzh");
		
		//1.创建spring的IOC容器对象
		//AppplicationContext
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//从IOC容器中获取Bean实例
		 HelloWorld helloWorld=(HelloWorld)ctx.getBean("helloWorld");
		 System.out.println(helloWorld);
		//调用hello方法
		helloWorld.hello();
	}
}
