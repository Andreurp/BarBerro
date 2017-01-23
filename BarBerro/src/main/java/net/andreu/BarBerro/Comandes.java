package net.andreu.BarBerro;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comandes {

	List<Comanda> comandes;
	
	public Comandes(){
		
	}

	public Comandes(List<Comanda> comandes) {
		this.comandes = comandes;
	}

	public List<Comanda> getComandes() {
		return comandes;
	}

	public void setComandes(List<Comanda> comandes) {
		this.comandes = comandes;
	}
}
