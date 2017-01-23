package net.andreu.BarBerro;

public class Beguda {

	private String nom;
	private String quantitat;
	
	public Beguda(){
		
	}

	public Beguda(String nom, String quantitat) {
		this.nom = nom;
		this.quantitat = quantitat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(String quantitat) {
		this.quantitat = quantitat;
	}
	
	
}
