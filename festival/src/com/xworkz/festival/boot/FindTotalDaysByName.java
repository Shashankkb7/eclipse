package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindTotalDaysByName {

	public static void main(String[] args) {
		System.out.println("Runnind in FindTotalDaysByName ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findTotalDaysByName");
		query.setParameter("nam", "Navarathri");
		Object obj = query.getSingleResult();
		int result = (int) obj;
		System.out.println(result);
		manager.close();
	}

}
