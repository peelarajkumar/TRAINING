package com.hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Student rahul = new Student();
		rahul.setId(1012);
		rahul.setName("Ravindra  ");
		rahul.setAge("21");
		rahul.setMarks("990");
		
		Transaction tx = se.beginTransaction();
		se.save(rahul);
		tx.commit();
		
		se.close();
		sf.close();
	}

}
