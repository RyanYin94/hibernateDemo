package cn.yinruiyang.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.yinruiyang.manytomanyentity.Role;
import cn.yinruiyang.manytomanyentity.User;
import cn.yinruiyang.utils.HibernateSessionFactoryBuilder;

public class ManytoManySave {
	
	@Test
	public void testSave(){
		
		SessionFactory sessionfactory = null;
		Session session = null;
		Transaction transaction = null;
		
		try{
			sessionfactory = HibernateSessionFactoryBuilder.getSessionFactory();
			session = sessionfactory.openSession();
			transaction = session.beginTransaction();
//			创建两个user 三个role  ，让他们互相产生一些关系
			User user1 = new User();
			user1.setUser_name("Ryan");
			user1.setUser_password("111");
			User user2 = new User();
			user2.setUser_name("Bob");
			user2.setUser_password("222");
			
			Role role1 = new Role();
			role1.setRole_name("manager");
			role1.setRole_memo("manager");
			Role role2 = new Role();
			role2.setRole_name("secretary");
			role2.setRole_memo("secretary");
			Role role3 = new Role();
			role3.setRole_name("CEO");
			role3.setRole_memo("CEO");
			
			user1.getSetRole().add(role1);
			user1.getSetRole().add(role3);
			
			user2.getSetRole().add(role2);
			user2.getSetRole().add(role1);
			
			session.save(user1);
			session.save(user2);
			
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
//			nothing need to be closed
			session.close();
			sessionfactory.close();
		}
	}

}
