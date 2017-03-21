//package cn.yinruiyang.hibernatetest;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.junit.Test;
//
//import cn.yinruiyang.entity.Contacts;
//import cn.yinruiyang.entity.Customer;
//import cn.yinruiyang.utils.HibernateSessionFactoryBuilder;
//
//public class OnetoMangSave {
//	@Test
//	public void testAdd(){
//		Session session = null;
//		Transaction transaction = null;
//		
//		try{
//			session = HibernateSessionFactoryBuilder.getSessionWithThread();
//			transaction = session.beginTransaction();
//			
//			Customer customer = new Customer();
//			customer.setCustName("Lee");
//			customer.setCustLevel("normal");
//			customer.setCustSource("life");
//			customer.setCustPhone("2123");
//			customer.setCustMobile("4321");
//			
//			Contacts contacts = new Contacts();
//			contacts.setConName("Yang");
//			contacts.setConGender("female");
//			contacts.setConPhone("4ew456");
//			
//			customer.getSet().add(contacts);
//			
//			session.save(customer);
//
////			customer.getSet().add(contacts);
////			contacts.setCustomer(customer);
////			
////			session.save(customer);
////			session.save(contacts);
//			
//			transaction.commit();
//		}catch (Exception e) {
//			e.printStackTrace();
//			transaction.rollback();
//		}finally{
////			session.close();
//		}
//	}
//}
