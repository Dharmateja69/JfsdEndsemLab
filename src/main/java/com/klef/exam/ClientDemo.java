package com.klef.exam;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        
        Transaction th = s.beginTransaction();
        
        
        String hql = "UPDATE Department SET name = ?1,location=?2  WHERE id = ?3";
            
        int  updatedCount = s.createQuery(hql).setParameter(1, "sidhu").setParameter(2, "klu").setParameter(3, 1).executeUpdate();
        
        
        
	        th.commit();
	        System.out.println("Records Updated: " + updatedCount);

	        s.close();
	}

}

       