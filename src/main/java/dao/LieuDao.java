package dao;
import org.hibernate.Session;

import model.Lieu;
import util.HibernateUtil;
public class LieuDao {
	void insertLieu(Lieu l) {

		Session s = HibernateUtil.getSessionFactory().openSession();//getCurrentSession();
		s.beginTransaction();
		s.save(l);
		s.getTransaction().commit();

	}

	Lieu selectLieu(int id) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		Lieu l = (Lieu) s.get(Lieu.class, id);
		s.getTransaction().commit();
		return l;
	}

	void updateLieu(int id) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		if(s==null)
			s.beginTransaction();
		Lieu l = (Lieu) s.get(Lieu.class, id);
		s.update(l);
		s.getTransaction().commit();

	}

	void deleteLieu(int id) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		Lieu l = (Lieu) s.get(Lieu.class, id);
		s.delete(l);
		s.getTransaction().commit();

	}
}
