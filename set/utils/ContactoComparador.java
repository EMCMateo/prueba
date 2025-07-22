package utils;
import java.util.Comparator;
import model.Contacto;

public class ContactoComparador implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        int x = c1.getApellido().compareTo(c2.getApellido());
        if (x != 0){
            return x;        
        }
        int y = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if (y != 0) {
            return y;
            
        }
        else{
            return 0;
        }
    }

    

    
}
