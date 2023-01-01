package dao;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.*;
import util.HibernateUtil;
public class TestDao {
	public static void main(String[] args) {
		FormationDao fd=new FormationDao();
		LieuDao ld=new LieuDao();
		FormateurDao ff= new FormateurDao();
		
		// ***** Lieu
		
		Lieu l1=new Lieu(1, "aa","df");
//		Lieu l2=new Lieu(2, "dqsd","dqsdq");
//		Lieu l3=new Lieu(3, "dqs","fdqsfsd");
//		ld.insertLieu(l3);
//		ld.insertLieu(l1);
//		ld.insertLieu(l2);
		
		// ***** Fo
//		Lieu l1=ld.selectLieu(1);
		Formation f1=new Formation(1, "Java",l1);
		Formateur f= new Formateur("BK7100645","Rezki",20);
		Set<Formateur>listFormateur=new HashSet<Formateur>();
		listFormateur.add(f);
		f1.setListFormateur(listFormateur);
		fd.insertFormation(f1);
	}
}
