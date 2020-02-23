package com.wts;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: BootStart 
 * @Description: 启动服务提供者
 * @author:wts 
 * @date: 2020年2月22日 下午7:03:56
 */
public class BootStart {

	public static void main(String[] args) throws Exception {
		
		// 加载服务的容器
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		context.start();
		
		// 加载服务到容器
		System.in.read();
	}
	
}
