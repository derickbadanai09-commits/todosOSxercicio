import Envio.envioInternacional;
import Envio.envios;
import Envio.enviosNacional;
import hoteles.alojamiento;
import hoteles.camping;
import hoteles.hotel;

public class Main {
    public static void main(String[] args) {
        /*alojamiento pi = new alojamiento("sevilla" , "lokidao", 55);
        System.out.println(pi.calcuarPrecio(2));
        System.out.println(pi.toString());*/
        hotel at = new hotel("barcelona","Barceló",200,true);
        System.out.println(at.calcuarPrecio(5));
    camping ki = new camping("Sevilla", "lokidao", 55, 50, 75 ,true);
     System.out.println(ki);
        System.out.println(ki.getCapacidadRestante());
    }
}