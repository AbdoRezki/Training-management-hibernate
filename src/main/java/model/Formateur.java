package model;
import java.util.HashSet;
import java.util.Set;
public class Formateur {
	private String cin;
	private String nom;
	private int age;
	private Set<Formation>listFormation=new HashSet<Formation>() ;
	public Formateur(String cin, String nom, int age) {
		this.cin=cin;
		this.nom=nom;
		this.age=age;
	}
	public Formateur(){
		
	}
	public String getCin() {
		return this.cin;
	}
	public String getNom() {
		return this.nom;
	}
	public int getAge() {
		return this.age;
	}
	public void setCin(String cin) {
		this.cin=cin;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public Set<Formation> getListFormation() {
		return listFormation;
	}

	public void setListFormation(Set<Formation> listFormation) {
		this.listFormation = listFormation;
	}
	
}
