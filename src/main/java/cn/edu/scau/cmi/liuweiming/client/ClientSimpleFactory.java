package cn.edu.scau.cmi.liuweiming.client;

import java.util.List;

import cn.edu.scau.cmi.liuweiming.dao.StudentDao;
import cn.edu.scau.cmi.liuweiming.domain.Student;

public class ClientSimpleFactory {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		studentDao.addStudent(new Student("1", "gitSome"));
		List<Student> res = studentDao.select();
		for (Student i : res) {
			System.out.println(i.getStudentName() + "  " + i.getStudentID());
		}
	}
}
