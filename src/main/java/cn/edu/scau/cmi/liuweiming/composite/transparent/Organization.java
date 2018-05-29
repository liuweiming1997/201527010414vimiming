package cn.edu.scau.cmi.liuweiming.composite.transparent;

import java.util.ArrayList;

public abstract class Organization {
	ArrayList<Organization> ls = new ArrayList<Organization>();
	String name;
	Organization(String _name) {
		name = _name;
	}
	public abstract String getName();
	public abstract boolean add(Organization arg0);
	public abstract boolean remove(Organization arg0);
	public abstract void show();
}
