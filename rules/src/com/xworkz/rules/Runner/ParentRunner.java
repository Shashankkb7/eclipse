package com.xworkz.rules.Runner;

import com.xworkz.rules.Parent;
import com.xworkz.rules.bridge.Children;

public class ParentRunner {

	public static void main(String[] args) {

		Parent parent = new Children();
		parent.descent();
		parent.father();
		parent.name();
		parent.useMobile();
		parent.working();
	}

}
