package com.xworkz.boot;

import com.xworkz.things.Watch;
import com.xworkz.things.WatchModify;

public class WatchRunner {

	public static void main(String[] args) {

		Watch watch = new Watch();
		System.out.println(watch.getBrand());
		System.out.println(watch.getType());
		WatchModify modify = new WatchModify();
		modify.useWatch(watch);

	}

}
