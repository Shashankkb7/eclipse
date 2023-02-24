package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;

public class FindByNameAndRegionAndMainGod {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameAndRegionAndMainGod ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameAndRegionAndMainGod");
		query.setParameter("nam", "Lohri");
		query.setParameter("reg", "Andhra pradesh");
		query.setParameter("main", "Lohri");
		Object obj = query.getSingleResult();
		FestivalEntity entity = (FestivalEntity) obj;
		System.out.println(entity);
	}

}
