package cn.edu.scau.cmi.liuweiming.client;

import cn.edu.scau.cmi.liuweiming.composite.transparent.Organization;
import cn.edu.scau.cmi.liuweiming.composite.transparent.Organization_Composite;
import cn.edu.scau.cmi.liuweiming.composite.transparent.Person;

public class Composite_transparent {
	public static void main(String args[]) {
		Organization person = new Person("vimi");
		System.out.println("person name : " + person.getName());
		
		Organization o = new Organization_Composite("man group");
		o.add(new Organization_Composite("liangzaoqing"));
		o.add(new Organization_Composite("liuweiming"));
		o.add(new Organization_Composite("student"));
		System.out.println("organization name : " + o.getName());
		o.show();
	}
}
