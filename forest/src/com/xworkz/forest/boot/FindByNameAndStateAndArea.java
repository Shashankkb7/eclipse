package com.xworkz.forest.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forest.entity.ForestEntity;

public class FindByNameAndStateAndArea {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByNameAndStateAndArea ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameAndStateAndArea");
		Object obj = query.getSingleResult();
		ForestEntity entity = (ForestEntity) obj;
		System.out.println(entity);

	}

}
