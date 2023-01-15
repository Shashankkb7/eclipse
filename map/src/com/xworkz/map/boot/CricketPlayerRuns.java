package com.xworkz.map.boot;

import java.util.Map;
import java.util.TreeMap;

public class CricketPlayerRuns {

	public static void main(String[] args) {

		Map<String, Integer> runs = new TreeMap<String, Integer>((run1, run2) -> run2.compareTo(run1));
		runs.put("Virat Kohli", 40123);
		runs.put("Rohit Sharma", 38450);
		runs.put("Sachin Tendulkar", 54203);
		runs.put("K L Rahul", 23040);
		runs.put("M S Dhoni", 9200);

		System.out.println("Sorting in descending order");
		runs.forEach((k, v) -> System.out.println("Player :" + k + ":: Runs :" + v));

		System.out.println(System.lineSeparator());
		System.out.println("Removing an entry if runs is lesser than 10000");
		runs.forEach((key, values) -> {
			if (values < 10000) {
				runs.remove(key, values);
				System.out.println("Player:" + key + ":: Runs :" + values);
			}
		});
	}

}
