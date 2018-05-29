package cn.edu.scau.cmi.liuweiming.composite.safe;

public class Person extends Organization {

	public Person(String _name) {
		super(_name);
	}

	@Override
	public String getName() {
		return name;
	}
	
}
