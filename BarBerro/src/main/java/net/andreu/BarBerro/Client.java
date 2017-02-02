package net.andreu.BarBerro;

public class Client {
	
	private String nom;
	private String cognom;
	
	public Client(){
		
	}

	public Client(String nom, String cognom) {
		this.nom = nom;
		this.cognom = cognom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", cognom=" + cognom + "]";
	}
	
}
