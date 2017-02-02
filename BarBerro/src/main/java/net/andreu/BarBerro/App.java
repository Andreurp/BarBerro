package net.andreu.BarBerro;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException
    {
    	List<String> noms = Arrays.asList("comandes1", "comandes2", "comandes3", "comandes4", "comandes5", "comandes6", "comandes7");
    	for(String s: noms){
    		llegirFitxer(s);
    	}
	}

	private static void llegirFitxer(String f) throws JAXBException {
		File fitxer = new File("src/main/resources/"+f+".xml");
		
		JAXBContext context = JAXBContext.newInstance(Comandes.class);
    	Unmarshaller lector = context.createUnmarshaller();
		Comandes comandes = (Comandes) lector.unmarshal(fitxer);
		Comandes com = estafarHisenda(comandes);
		generarFitxer(com, f);
	}

	private static Comandes estafarHisenda(Comandes comandes) {
		Comandes cAux = new Comandes();

		for(Comanda c : comandes.getComandes()){
			if(c.getCerveses()<2){
				cAux.addComanda(c);
			}
		}
		return cAux;
	}

	private static void generarFitxer(Comandes comandes, String f) throws JAXBException {
		/*List<Beguda> begudes = Arrays.asList(new Beguda("vi", "4"), new Beguda("Mojito", "2"));
    	Client client = new Client("Bill", "Clinton");
    	
    	List<Comanda> comanda = Arrays.asList(new Comanda(client, begudes));
    	Comandes comandes = new Comandes(comanda);*/
    	
    	JAXBContext context = JAXBContext.newInstance(Comandes.class);
    	Marshaller creador = context.createMarshaller();
    	
    	creador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    	//creador.marshal(comandes, System.out);
		creador.marshal(comandes, new File("src/main/resources/modificats/"+f+".xml"));
		
	}
}
