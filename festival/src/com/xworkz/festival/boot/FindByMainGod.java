package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;

public class FindByMainGod {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByMainGod ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByMainGod");
		query.setParameter("main", "Timmappa");
		Object result = query.getSingleResult();
		FestivalEntity entity = (FestivalEntity) result;
		System.out.println(entity);
		manager.close();
	}

}
