package util;


import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {
    public static final SessionFactory sessionFactory;

    static {
        try {
            // Création de la SessionFactory à partir de hibernate.cfg.xml
            sessionFactory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            // les logspour les exceptions
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}