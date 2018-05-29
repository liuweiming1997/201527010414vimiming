package cn.edu.scau.cmi.liuweiming.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.scau.cmi.liuweiming.spring.domain.Student;

public class SpringClient {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("vimi.xml");
		Student student=(Student) ac.getBean("liuweiming");
		System.out.println(student.getTutor().getName());
	}
}
