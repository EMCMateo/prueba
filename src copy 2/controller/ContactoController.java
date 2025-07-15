package controller;

import java.util.Set;
import java.util.TreeSet;
import model.Contacto;
import utils.ContactoComparador;
import utils.ContactoComparadorConNumero;

public class ContactoController {
    public ContactoController(){
        runTreeContacto();
        System.out.println("-------------------------------------------");
        runTreeContactoNumeros();
    }
    public void runTreeContacto(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));

        for (Contacto contacto : agenda){
            System.out.println(contacto);
        }
    }

    public void runTreeContactoNumeros(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparadorConNumero());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));

        for (Contacto contacto : agenda){
            System.out.println(contacto);
        }
    }
    
}
