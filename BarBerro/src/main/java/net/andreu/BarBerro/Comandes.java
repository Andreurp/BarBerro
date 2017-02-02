package net.andreu.BarBerro;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Comandes {

	@XmlElement(name="comanda")
	List<Comanda> comandes;
	
	public Comandes(){
		comandes = new ArrayList<Comanda>();
	}

	public Comandes(List<Comanda> comandes) {
		this.comandes = comandes;
	}

	public List<Comanda> getComandes() {
		return comandes;
	}
	public void addComanda(Comanda c){
		comandes.add(c);
	}

	public void setComandes(List<Comanda> comandes) {
		this.comandes = comandes;
	}
}
