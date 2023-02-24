package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindRegionAndMainGodByNameAndId {

	public static void main(String[] args) {
		System.out.println("Runnind in FindRegionAndMainGodByNameAndId ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findRegionAndMainGodByNameAndId");
		query.setParameter("nam", "Shivarathri");
		query.setParameter("id", 9);
		Object obj = query.getSingleResult();
		Object[] array=(Object[])obj;
		System.out.println(array[0]);
		System.out.println(array[1]);
		manager.close();
	}

}
