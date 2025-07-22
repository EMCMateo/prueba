package utils;
import java.util.Comparator;
import model.Contacto;

public class ContactoComparadorConNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        int compApe = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (compApe != 0){
            return compApe;      
        }
        int compNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if (compNombre != 0){
            return compNombre;
        }
        int resultado = c2.getTelefono().compareToIgnoreCase(c1.getTelefono());
        if (resultado != 0 ){
            return resultado;
        }
        else{
            return 0;
        }



    }

    

    
}
