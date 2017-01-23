package net.andreu.BarBerro;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Comanda {

	Client client;
	@XmlElementWrapper(name="begudes")
	@XmlElement(name="beguda")
	List<Beguda> begudes;
	
	public Comanda(){
		
	}

	public Comanda(Client client, List<Beguda> begudes) {
		this.client = client;
		this.begudes = begudes;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Beguda> getBegudes() {
		return begudes;
	}

	public void setBegudes(List<Beguda> begudes) {
		this.begudes = begudes;
	}
	
	
}
