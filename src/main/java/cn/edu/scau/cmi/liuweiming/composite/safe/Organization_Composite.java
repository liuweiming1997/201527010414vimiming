package cn.edu.scau.cmi.liuweiming.composite.safe;

import java.util.ArrayList;

public class Organization_Composite extends Organization {
	public Organization_Composite(String _name) {
		super(_name);
	}

	ArrayList<Organization> ls = new ArrayList<Organization>();
	
	public boolean add(Organization arg0) {
		return ls.add(arg0);
	}
	
	public boolean remove(Organization arg0) {
		return ls.remove(arg0);
	}
	
	public void show() {
		for (int i = 0; i < ls.size(); ++i) {
			System.out.println(ls.get(i).name);
		}
	}
	
	@Override
	public String getName() {
		return name;
	}
}
