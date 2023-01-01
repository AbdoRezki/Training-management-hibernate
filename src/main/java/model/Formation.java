package model;
import java.util.HashSet;
import java.util.Set;
public class Formation {
	private int id;
	private String theme;
	private Lieu lieu;
	private Set<Formateur>listFormateur=new HashSet<Formateur>() ;
	
	public Formation(int id,String theme) {
		this.id=id;
		this.theme=theme;
	}
	public Formation(int id,String theme, Lieu lieu) {
		this.id=id;
		this.theme=theme;
		this.lieu=lieu;
	}
	public Formation() {
		
	}
	public String getTheme() {
		return this.theme;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setTheme(String theme) {
		this.theme=theme;
	}
	public Lieu getLieu() {
		return this.lieu;
	}
	public void setLieu(Lieu lieu) {
		this.lieu=lieu;
	}
	public Set<Formateur> getListFormateur() {
		return listFormateur;
	}

	public void setListFormateur(Set<Formateur> listFormateur) {
		this.listFormateur = listFormateur;
	}
}
