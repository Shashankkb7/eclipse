package com.xworkz.associations.array.boot;

import com.xworkz.associations.array.thing.Address;
import com.xworkz.associations.array.thing.Cities;
import com.xworkz.associations.array.thing.Company;
import com.xworkz.associations.array.thing.Countries;
import com.xworkz.associations.array.thing.Email;
import com.xworkz.associations.array.thing.Job;
import com.xworkz.associations.array.thing.Location;
import com.xworkz.associations.array.thing.Person;
import com.xworkz.associations.array.thing.State;

public class PersonRunner {

	public static void main(String[] args) {

		Person person = new Person("Shashank");
		Job job = new Job(500000L, "Developer", true);
		Company company = new Company("TCS", "Rathan Tata");
		Countries countries = new Countries("India", "Narendra modi", "Droupadi Murmu", 28);
		Cities cities = new Cities("Chikkamagalur", "Coffee", "gottilla", 145.25);
		State state = new State("Karnataka", "Bommai", 31, "gottu");
		Location location = new Location(15, "Rajajinagar");
		Address address = new Address(location);
		address.showOff();
		job.setCompany(company);
		location.setAddress(state, countries, cities);
		person.setJob(job);
		Email email1 = new Email("unknown@gmail.com", 1234520, 74852012, company);
		email1.setCompany(company);
		Email email2 = new Email("unknown2@gmail.com", 45675851, 635617852, company);
		email2.setCompany(company);
		Email email3 = new Email("unknown3@gmail.com", 7894562, 88511452, company);
		email3.setCompany(company);
		Email email4 = new Email("unknown4@gmail.com", 98745662, 971002563, company);
		email4.setCompany(company);
		Email[] emails = { email1, email2, email3, email4 };
		person.setEmail(emails);
		person.showOff();

	}

}
