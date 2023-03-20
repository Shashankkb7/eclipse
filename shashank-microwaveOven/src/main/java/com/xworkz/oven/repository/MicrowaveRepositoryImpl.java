package com.xworkz.oven.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.oven.entity.MicrowaveEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class MicrowaveRepositoryImpl implements MicrowaveRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public MicrowaveRepositoryImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(MicrowaveEntity entity) {
		log.info("Running save in Repository");
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
		log.info("find by id in repo " + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		MicrowaveEntity fromDb = entityManager.find(MicrowaveEntity.class, id);
		entityManager.close();
		return fromDb;
	}

	@Override
	public List<MicrowaveEntity> findByName(String name) {
		log.info("Running findByName in repository " + name);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nam", name);
			log.info("query : " + query);
			List<MicrowaveEntity> list = query.getResultList();
			log.info("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			log.info("Released the connection");
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
		log.info("Running findByColor in repository " + color);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByColor");
			query.setParameter("col", color);
			log.info("query : " + query);
			List<MicrowaveEntity> list = query.getResultList();
			log.info("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			log.info("Released the connection");
		}
	}
	
	
	@Override
	public List<MicrowaveEntity> findByNameAndColor(String name, String color) {
		log.info("Running findByNameAndColor in repository " + name + color);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameAndColor");
			query.setParameter("nam", name);
			query.setParameter("col", color);
			log.info("query : " + query);
			List<MicrowaveEntity> list = query.getResultList();
			log.info("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			log.info("Released the connection");
		}
	}
	
	@Override
	public List<MicrowaveEntity> findAll() {
		log.info("Running findAll in repository ");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findAll");
			log.info("query : " + query);
			List<MicrowaveEntity> list = query.getResultList();
			log.info("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			log.info("Released the connection");
		}
	}
}
