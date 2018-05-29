package cn.edu.scau.cmi.liuweiming.composite.transparent;

public class Organization_Composite extends Organization {

	public Organization_Composite(String _name) {
		super(_name);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean add(Organization arg0) {
		return ls.add(arg0);
	}

	@Override
	public boolean remove(Organization arg0) {
		return ls.remove(arg0);
	}

	@Override
	public void show() {
		for (int i = 0; i < ls.size(); ++i) {
			System.out.println(ls.get(i).name);
		}
	}
	
}
