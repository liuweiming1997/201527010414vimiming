package cn.edu.scau.cmi.liuweiming.client;

import cn.edu.scau.cmi.liuweiming.singletonpattern.Persident;

public class SingletonClient {
	public static void main(String[] args) {
		Persident one = Persident.getInstance("习近平");
		Persident two = Persident.getInstance("习近平");
		System.out.println(one);
		System.out.println(two);
		if (one == two) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}
}