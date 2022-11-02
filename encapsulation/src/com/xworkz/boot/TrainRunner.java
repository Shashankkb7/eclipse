package com.xworkz.boot;

import com.xworkz.things.Train;
import com.xworkz.things.TrainModify;

public class TrainRunner {

	public static void main(String[] args) {

		Train train = new Train();
		System.out.println(train.getName());
		TrainModify modify = new TrainModify();
		modify.useTrain(train);

	}

}
