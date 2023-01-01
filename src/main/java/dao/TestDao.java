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
//		fd.insertFormation(f1);
//		ld.deleteLieu(2);
		Formateur f= new Formateur("BK7100645","Rezki",20);
		Set<Formateur>listFormateur=new HashSet<Formateur>();
//		Set<Formation>listFormation=new HashSet<Formation>();
//		listFormation.add(f1);
//		f.setListFormation(listFormation);
		listFormateur.add(f);
		f1.setListFormateur(listFormateur);
		fd.insertFormation(f1);
//		ff.InsererFormateur(f);
//		System.out.println(f1.getListFormateur());
//		ff.InsererFormateur(f);
		
		
		
		
		//selection
		/*Produit p4=pd.selectProduit("C01");
		System.out.println(p4);
		
		//modification
		p4.setDesig("PC Portable");
		pd.updateProduit("C01");
		System.out.println(p4);*/
		
		//suppression 
		//pd.deleteProduit("C03");
		
		/*
		Categorie c=cd.selectCategorie(2);
		System.out.println(c);
		Produit pnv=new Produit("cacke", 100, 20, c, "c04");
		pd.insertProduit(pnv);
		*/
		//modifier les produits en ajoutant les categories
		//Categorie c2=cd.selectCategorie(2);
		//Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		//s.close();
		
		
		//Produit p2=new Produit("C66", 200, "USB", 10,c2);
		//Produit p3=new Produit("C77", 40, "Souris",2,c2);
		//Produit p4=new Produit("C88", 40, "clavier",2,c2);
		//s = HibernateUtil.getSessionFactory().openSession();
		//pd.insertProduit(p2);
		//pd.insertProduit(p3);
		//pd.insertProduit(p4);
		//s = HibernateUtil.getSessionFactory().getCurrentSession();
		//s.close();
		
		//Set<Produit>L=new HashSet<Produit>() ;
		//L.add(p2);L.add(p3);
		/*L.add(p4);
		Commande cmd = new Commande(55,"iagi",L);
		s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.save(cmd);
		s.getTransaction().commit();*/
	}
}
