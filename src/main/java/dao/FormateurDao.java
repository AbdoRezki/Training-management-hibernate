package dao;
import org.hibernate.Session;

import model.Formateur;
import util.HibernateUtil;
public class FormateurDao {
	void InsererFormateur(Formateur f) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();//openSession();//getCurrentSession();
		s.beginTransaction();
		s.save(f);
		s.getTransaction().commit();

	}

	Formateur selectFormateur(String cin) {
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		Formateur f = (Formateur) s.get(Formateur.class, cin);
		s.getTransaction().commit();
		return f;
	}

	void updateFormateur(String cin) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		if(s==null)
			s.beginTransaction();
		Formateur f = (Formateur) s.get(Formateur.class, cin);
		s.update(f);
		s.getTransaction().commit();

	}

	void deleteFormateur(String cin) {

		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		s.beginTransaction();
		Formateur f = (Formateur) s.get(Formateur.class, cin);
		s.delete(f);
		s.getTransaction().commit();

	}
}
