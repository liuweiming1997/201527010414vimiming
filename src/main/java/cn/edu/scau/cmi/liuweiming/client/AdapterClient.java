package cn.edu.scau.cmi.liuweiming.client;

import cn.edu.scau.cmi.liuweiming.adapter.AdapterOfClass;
import cn.edu.scau.cmi.liuweiming.adapter.AdapterOfObject;
import cn.edu.scau.cmi.liuweiming.adapter.Target;
import cn.edu.scau.cmi.liuweiming.adapter.TargetOfObject;

public class AdapterClient {
	public static void main(String[] args) {
		Target A = new AdapterOfClass();
		A.showAdaptee();
		A.showAdapter();
		
		TargetOfObject B = new AdapterOfObject();
		B.showAdapter();
		B.showAdaptee();
		
	}
}
