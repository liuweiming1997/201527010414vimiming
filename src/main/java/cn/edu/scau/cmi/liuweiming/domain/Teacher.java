package cn.edu.scau.cmi.liuweiming.domain;

public class Teacher implements Person {
	String id, name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Teacher() {
		super();
	}
	
}
