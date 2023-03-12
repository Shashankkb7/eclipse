package com.xworkz.oven.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
		MicrowaveEntity fromDb = entityManager.find(MicrowaveEntity.class, id);
		entityManager.close();
		return fromDb;
	}

	@Override
	public List<MicrowaveEntity> findByName(String name) {
		System.out.println("Running findByName in repository " + name);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nam", name);
			System.out.println("query : " + query);
			List<MicrowaveEntity> list = query.getResultList();
			System.out.println("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			System.out.println("Released the connection");
		}
	}

	@Override
	public boolean update(MicrowaveEntity entity) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		} finally {
			manager.close();
		}
	}

	@Override
	public MicrowaveEntity deleteById(int id) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			MicrowaveEntity manager2 = manager.find(MicrowaveEntity.class, id);
			transaction.begin();
			manager.remove(manager2);
			transaction.commit();
			return manager2;
		} finally {
			manager.close();
		}
	}

	
	@Override
	public List<MicrowaveEntity> findByColor(String color) {
		System.out.println("Running findByColor in repository " + color);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByColor");
			query.setParameter("col", color);
			System.out.println("query : " + query);
			List<MicrowaveEntity> list = query.getResultList();
			System.out.println("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			System.out.println("Released the connection");
		}
	}
	
	
	@Override
	public List<MicrowaveEntity> findByNameAndColor(String name, String color) {
		System.out.println("Running findByNameAndColor in repository " + name + color);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameAndColor");
			query.setParameter("nam", name);
			query.setParameter("col", color);
			System.out.println("query : " + query);
			List<MicrowaveEntity> list = query.getResultList();
			System.out.println("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			System.out.println("Released the connection");
		}
	}
	
	@Override
	public List<MicrowaveEntity> findAll() {
		System.out.println("Running findAll in repository ");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAll");
			System.out.println("query : " + query);
			List<MicrowaveEntity> list = query.getResultList();
			System.out.println("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			System.out.println("Released the connection");
		}
	}
}
