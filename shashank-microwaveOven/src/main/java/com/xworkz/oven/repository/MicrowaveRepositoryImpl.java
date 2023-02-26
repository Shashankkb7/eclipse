package com.xworkz.oven.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.oven.entity.MicrowaveEntity;

@Repository
public class MicrowaveRepositoryImpl implements MicrowaveRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public MicrowaveRepositoryImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(MicrowaveEntity entity) {
		System.out.println("Running save in Repository");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}

	@Override
	public MicrowaveEntity findById(int id) {
		System.out.println("find by id in repo " + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		MicrowaveEntity fromDb=entityManager.find(MicrowaveEntity.class, id);
		entityManager.close();
		return fromDb;
	}
}
