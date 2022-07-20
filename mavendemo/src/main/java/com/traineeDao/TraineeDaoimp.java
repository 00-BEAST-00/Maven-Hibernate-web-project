package com.traineeDao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Trainee;
import com.util.hibernateutil;

public class TraineeDaoimp implements TraineeDao {

	public void createtrainee(Trainee trainee) {
	
			SessionFactory sessionfactory = null;
			Session session =null;
			Transaction t = null;
			try {
				sessionfactory = hibernateutil.getSessionFactory();
				if(sessionfactory != null) {
					session = sessionfactory.openSession();
					t = session.getTransaction();
				    t.begin();
					session.save(trainee);
					t.commit();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		}
  
	}

