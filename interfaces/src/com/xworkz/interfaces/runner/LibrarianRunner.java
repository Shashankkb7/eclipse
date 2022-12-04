package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.follower.Readers;
import com.xworkz.interfaces.governor.Librarian;
import com.xworkz.interfaces.rules.LibraryRules;

public class LibrarianRunner {

	public static void main(String[] args) {

		LibraryRules library = new Readers();
		Librarian librarian = new Librarian(library);
		librarian.reading();

	}

}
