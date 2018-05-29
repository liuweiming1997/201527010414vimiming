package cn.edu.scau.cmi.liuweiming.factory;

import cn.edu.scau.cmi.liuweiming.domain.Teacher;

public class TeacherFactory implements Factory {
	public static Teacher getStudent() {
		return new Teacher();
	}
}
