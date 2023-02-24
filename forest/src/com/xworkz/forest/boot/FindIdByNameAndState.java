package com.xworkz.forest.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindIdByNameAndState {

	public static void main(String[] args) {
		System.out.println("Runnind in FindIdByNameAndState ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findIdByNameAndState");
		Object obj = query.getSingleResult();
		int entity = (int) obj;
		System.out.println(entity);

	}

}
