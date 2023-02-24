package com.xworkz.forest.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forest.entity.ForestEntity;

public class FindByState {

	public static void main(String[] args) {
		System.out.println("Runnind in FindByState ");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByState");
		Object obj = query.getSingleResult();
		ForestEntity entity = (ForestEntity) obj;
		System.out.println(entity);

	}

}
