package com.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateutil {

		public static SessionFactory sessionFactory;
		public static SessionFactory getSessionFactory() {
			
			Configuration configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			return sessionFactory;
		}
		
		public static void shutDown() {
			getSessionFactory().close();
		}
		
	}

