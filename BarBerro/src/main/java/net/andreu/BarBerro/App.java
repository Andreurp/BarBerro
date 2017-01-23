package net.andreu.BarBerro;

//import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException
    {
    	List<Beguda> begudes = Arrays.asList(new Beguda("vi", "4"), new Beguda("Mojito", "2"));
    	Client client = new Client("Bill", "Clinton");
    	
    	List<Comanda> comanda = Arrays.asList(new Comanda(client, begudes));
    	Comandes comandes = new Comandes(comanda);
    	
    	JAXBContext context = JAXBContext.newInstance(Comandes.class);
    	Marshaller creador = context.createMarshaller();
    	
    	creador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    	creador.marshal(comandes, System.out);
    	//creador.marshal(comandes, new File("comandes.xml"));
    }
}
