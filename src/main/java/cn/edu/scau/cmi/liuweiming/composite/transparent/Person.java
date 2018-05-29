package cn.edu.scau.cmi.liuweiming.composite.transparent;

public class Person extends Organization {
	String errMessage = "can not use it";
	
	public Person(String _name) {
		super(_name);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean add(Organization arg0) {
		System.err.println(errMessage);
		return false;
	}

	@Override
	public boolean remove(Organization arg0) {
		System.err.println(errMessage);
		return false;
	}

	@Override
	public void show() {
		System.err.println(errMessage);
	}
	
}
