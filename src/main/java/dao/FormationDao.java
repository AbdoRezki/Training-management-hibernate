package dao;
import org.hibernate.Session;

import model.Formation;
import util.HibernateUtil;
public class FormationDao {
	void insertFormation(Formation f) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();//openSession();//getCurrentSession();
		s.beginTransaction();
		s.save(f);
		s.getTransaction().commit();

	}

	Formation selectFormation(int id) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		Formation f = (Formation) s.get(Formation.class, id);
		s.getTransaction().commit();
		return f;
	}

	void updateFormation(int id) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		if(s==null)
			s.beginTransaction();
		Formation f = (Formation) s.get(Formation.class, id);
		s.update(f);
		s.getTransaction().commit();

	}

	void deleteFormation(int id) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		Formation f = (Formation) s.get(Formation.class, id);
		s.delete(f);
		s.getTransaction().commit();

	}
}
