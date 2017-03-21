package cn.yinruiyang.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.yinruiyang.entity.Customer;

public class OnetoManyDelete {
	
	@Test
	public void testDelete(){
		Configuration configuration = null;
		SessionFactory sessionfactory = null;
		Session session = null;
		Transaction transaction = null;
		
		try{
			configuration = new Configuration();
			configuration.configure();
			sessionfactory = configuration.buildSessionFactory();
			session = sessionfactory.getCurrentSession();
			transaction = session.beginTransaction();
			Customer customer = session.get(Customer.class, 2);
			session.delete(customer);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally{
			sessionfactory.close();
		}
	}

}
