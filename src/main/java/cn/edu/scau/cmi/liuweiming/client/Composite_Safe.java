package cn.edu.scau.cmi.liuweiming.client;

import cn.edu.scau.cmi.liuweiming.composite.safe.Organization;
import cn.edu.scau.cmi.liuweiming.composite.safe.Organization_Composite;
import cn.edu.scau.cmi.liuweiming.composite.safe.Person;

public class Composite_Safe {
	public static void main(String args[]) {
		Organization person = new Person("vimi");
		System.out.println("person name : " + ((Person)person).getName());
		
		Organization o = new Organization_Composite("man group");
		((Organization_Composite)o).add(new Organization_Composite("liangzaoqing"));
		((Organization_Composite)o).add(new Organization_Composite("liuweiming"));
		((Organization_Composite)o).add(new Organization_Composite("student"));
		System.out.println("organization name : " + ((Organization_Composite)o).getName());
		((Organization_Composite)o).show();
	}
}
