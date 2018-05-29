package cn.edu.scau.cmi.liuweiming.composite.safe;

public abstract class Organization {
	String name;
	Organization(String _name) {
		name = _name;
	}
	abstract String getName();
}
