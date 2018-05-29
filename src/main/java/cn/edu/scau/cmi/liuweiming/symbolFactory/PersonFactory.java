package cn.edu.scau.cmi.liuweiming.symbolFactory;

import cn.edu.scau.cmi.liuweiming.domain.Person;
import cn.edu.scau.cmi.liuweiming.domain.Student;
import cn.edu.scau.cmi.liuweiming.domain.Teacher;

public class PersonFactory {
	final static String student = "student";
	final static String teacher = "teacher";
	public static Person getPerson(String name) {
		if (name.equals(student)) {
			return new Student();
		} else if (name.equals(teacher)) {
			return new Teacher();
		} else {
			System.out.println("no this element");
			while (true);
		}
	}
}
