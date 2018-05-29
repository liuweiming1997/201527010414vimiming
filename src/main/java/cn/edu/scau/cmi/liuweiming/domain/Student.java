package cn.edu.scau.cmi.liuweiming.domain;


public class Student implements Person {
    private String studentID, studentName;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public Student() {
        studentID = null;
        studentName = null;
    }

    public Student(String studentID, String studentName) {
        super();
        this.studentID = studentID;
        this.studentName = studentName;
    }
    
    public String getName() {
    	return this.studentName;
    }
}
