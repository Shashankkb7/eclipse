package com.xworkz.forest.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStateByNameAndArea {

	public static void main(String[] args) {
		System.out.println("Runnind in FindStateByNameAndArea ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findStateByNameAndArea");
		Object obj = query.getSingleResult();
		String entity = (String) obj;
		System.out.println(entity);

	}

}
