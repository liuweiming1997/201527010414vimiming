package cn.edu.scau.cmi.liuweiming.adapter;

public class AdapterOfObject implements TargetOfObject {
	
	Adaptee res = new Adaptee();
	
	public void showAdapter() {
		// TODO Auto-generated method stub
		System.out.println("Object_Adapter");
	}

	public void showAdaptee() {
		// TODO Auto-generated method stub
		res.showAdaptee();
	}
	
}
