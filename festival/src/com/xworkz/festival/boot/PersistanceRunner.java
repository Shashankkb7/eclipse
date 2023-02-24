package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festival.entity.FestivalEntity;

public class PersistanceRunner {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		FestivalEntity entity = new FestivalEntity("Yugadi", "Karnataka", 2, "Holage", "Ganapathi");
		FestivalEntity entity1 = new FestivalEntity("Ayudhapooje", "India", 1, "Karjekayi", "Chamundeshwari");
		FestivalEntity entity2 = new FestivalEntity("Navarathri", "Karnataka", 9, "Karjekayi", "Chamundeshwari");
		FestivalEntity entity3 = new FestivalEntity("Pongal", "Tamilnadu", 2, "Pongal", "Venkateshwara");
		FestivalEntity entity4 = new FestivalEntity("Onam", "Kerala", 2, "Karjekayi", "Timmappa");
		FestivalEntity entity5 = new FestivalEntity("Lohri", "Andhra pradesh", 1, "Barfi", "Lohri");
		FestivalEntity entity6 = new FestivalEntity("Shivarathri", "India", 1, "Payasa", "Shiva");
		FestivalEntity entity7 = new FestivalEntity("Independence day", "India", 1, "Chocolate", "Subhash chandra bose");
		FestivalEntity entity8 = new FestivalEntity("Guru purnima", "Karnataka",1, "Karjekayi", "Guru");
		FestivalEntity entity9 = new FestivalEntity("Holi", "India", 1, "Karjekayi", "Holi");
		FestivalEntity entity10 = new FestivalEntity("Bhai dooj", "Kerala", 2, "Karjekayi", "Hanuman");
		FestivalEntity entity11= new FestivalEntity("Makar sankranthi", "India", 2, "Yellu bella", "Rama");
		FestivalEntity entity12 = new FestivalEntity("Karva chauth", "India", 4, "Jalebi", "Karva");
		FestivalEntity entity13 = new FestivalEntity("Vijayadashami", "Karnataka", 3, "Mysore paak", "Chamundeshwari");
		FestivalEntity entity14 = new FestivalEntity("Ramzan", "India", 2, "Sweet biriyani", "Allah");
		FestivalEntity entity15 = new FestivalEntity("Gandhi jayanthi", "India", 1, "Chocolate", "Gandhi");
		FestivalEntity entity16 = new FestivalEntity("Raksha bhandan", "India", 1, "Barfi", "Raaki");
		FestivalEntity entity17 = new FestivalEntity("Durgashtami", "Karnataka", 1, "Baadrusha", "Durgadevi");
		FestivalEntity entity18 = new FestivalEntity("Kali puja", "India", 2, "Karjekayi", "Kali");
		FestivalEntity entity19= new FestivalEntity("Hanuman jayanthi", "India", 1, "Paanaka", "Haanuman");
		FestivalEntity entity20 = new FestivalEntity("Chatrapathi shivaji jayanthi", "India", 2, "Karjekayi", "Chatrapathi");
		FestivalEntity entity21 = new FestivalEntity("Akshaya tritiya", "Karnataka", 1, "Payasa", "Akshya tritiya");
		FestivalEntity entity22 = new FestivalEntity("Christmas", "India", 3, "Cake", "Christ");
		FestivalEntity entity23= new FestivalEntity("Varalakshmi vratam", "India", 1, "Laadu", "Varalakshmi");
		FestivalEntity entity24 = new FestivalEntity("Gandhi jayanthi", "India", 1, "Champakali", "Gandhi");
		manager.persist(entity);
		manager.persist(entity1);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		manager.persist(entity7);
		manager.persist(entity8);
		manager.persist(entity9);
		manager.persist(entity10);
		manager.persist(entity11);
		manager.persist(entity12);
		manager.persist(entity13);
		manager.persist(entity14);
		manager.persist(entity15);
		manager.persist(entity16);
		manager.persist(entity17);
		manager.persist(entity18);
		manager.persist(entity19);
		manager.persist(entity20);
		manager.persist(entity21);
		manager.persist(entity22);
		manager.persist(entity23);
		manager.persist(entity24);
		transaction.commit();
		manager.close();
	}

}
