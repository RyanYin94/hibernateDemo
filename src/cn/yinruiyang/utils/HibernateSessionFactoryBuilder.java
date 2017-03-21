package cn.yinruiyang.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryBuilder {
	
	private static Configuration cfg = null;
	private static SessionFactory sessionfactory = null;
	
	static{
		cfg = new Configuration();
		cfg.configure();
		sessionfactory = cfg.buildSessionFactory();		
	}
	
	public static Session getSessionWithThread(){
		return sessionfactory.getCurrentSession();
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionfactory;
	}
	
	public static void main(String[] args){
		
	}

}
