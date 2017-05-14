package com.diskun;


import com.diskun.Utils.HibernateUtil;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    private final static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
//        getCar();
        findStu();
        HibernateUtil.shutdown();
    }

    private static void getCar() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from CarEntity ");
        List list = query.list();
        System.out.println("list = " + list);
//        logger.info("new log");
        System.out.println( "Hello World!" );
//        HibernateUtil.shutdown();
    }


    public static void findStu(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from SrcStuDataEntity where stuId=2012303028");
        List list = query.list();
        System.out.println("list = " + list);
    }
}
