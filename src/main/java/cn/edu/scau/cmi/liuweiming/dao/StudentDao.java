package cn.edu.scau.cmi.liuweiming.dao;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import cn.edu.scau.cmi.liuweiming.domain.Student;
import cn.edu.scau.cmi.liuweiming.util.DButil;

public class StudentDao {
	public void addStudent(Student student) {
		try {
			Connection connection = DButil.getConnection();
			String sql = "insert into student(student_id, student_name) values(?, ?)";
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getStudentID());
			preparedStatement.setString(2, student.getStudentName());
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Student> select() {
		try {
			Connection connection = DButil.getConnection();
			Statement statement = (Statement) connection.createStatement();
			ResultSet resultset = (ResultSet) statement.executeQuery("select * from student");
			List<Student> ans = new ArrayList<Student>();
			Student student = null;
			while (((ResultSet) resultset).next()) {
				student = new Student();
				student.setStudentID(((ResultSet) resultset).getString("student_id")); // 数据库中的名字
				student.setStudentName(((ResultSet) resultset).getString("student_name"));
				ans.add(student);
			}
			return ans;
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
}