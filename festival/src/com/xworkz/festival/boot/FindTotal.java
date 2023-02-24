package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindTotal {

	public static void main(String[] args) {
		System.out.println("Runnind in FindTotal ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findTotal");
		Object obj = query.getSingleResult();
		Long result=(Long)obj;
		System.out.println(result);
		manager.close();
	}

}
