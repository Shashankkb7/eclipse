package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMainGodAndTotalDaysByName {

	public static void main(String[] args) {
		System.out.println("Runnind in FindMainGodAndTotalDaysByName ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMainGodAndTotalDaysByName");
		query.setParameter("nam", "Vijayadashami");
		Object obj = query.getSingleResult();
		Object[] array = (Object[]) obj;
		System.out.println(array[0]);
		System.out.println(array[1]);
		manager.close();
	}
}
