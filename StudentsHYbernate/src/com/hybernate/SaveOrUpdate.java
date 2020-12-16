package com.hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdate {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Student a=new Student();
		a.setId(110);
		a.setName("vikas mane");
		a.setMarks("895");
		a.setAge("27");
		Transaction tx=se.beginTransaction();
	
		se.saveOrUpdate(a);
		tx.commit();
		se.close();
		sf.close();
	}

}
