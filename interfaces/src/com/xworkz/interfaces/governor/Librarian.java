package com.xworkz.interfaces.governor;

import com.xworkz.interfaces.rules.LibraryRules;

public class Librarian {

	private LibraryRules library;

	public Librarian() {
		System.out.println("Default const of librarian...");
	}

	public Librarian(LibraryRules library) {
		super();
		this.library = library;
	}

	public void reading() {
		System.out.println("Running smoking and sleeping...");
		{
			if (this.library != null) {
				boolean smoke = this.library.Smoking();
				boolean sleep = this.library.sleeping();
				if (smoke == true && sleep == true) {
					System.out.println("Readers follow the rules");
				} else {
					System.out.println("Readers not follow the rules");
				}
			}
		}
	}
}
