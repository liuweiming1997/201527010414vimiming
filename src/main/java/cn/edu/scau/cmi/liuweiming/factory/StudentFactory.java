package cn.edu.scau.cmi.liuweiming.factory;

import cn.edu.scau.cmi.liuweiming.domain.Student;

public class StudentFactory implements Factory {
	public static Student getStudent() {
		return new Student();
	}
}
