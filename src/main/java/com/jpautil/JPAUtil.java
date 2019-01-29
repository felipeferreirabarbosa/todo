package com.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory;

	static {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("tododB");
		}
	}
	
	public static EntityManager getEntityManeger() {
		return factory.createEntityManager();
	}

}
