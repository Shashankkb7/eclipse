package com.xworkz.forest.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAreaByName {

	public static void main(String[] args) {
		System.out.println("Runnind in FindAreaByName ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findAreaByName");
		Object obj = query.getSingleResult();
		Double entity = (Double) obj;
		System.out.println(entity);
	}

}
