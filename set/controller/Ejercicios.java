package controller;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import model.Contacto;
import utils.ContactoComparador;

public class Ejercicios{

    public Ejercicios(){
        System.out.println("Ejercicio 1"); 
        System.out.println(tieneDuplicados(new int[ ] {1, 2, 3, 4, 5} ));
        System.out.println(tieneDuplicados(new int[ ] {1, 2, 3, 4, 5, 4, 3, 2, 45} ));
        System.out.println(isIsograma("murcielago"));
        System.out.println(isIsograma("camaleon"));
        String texto = " La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía? Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente. En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas. ";
        System.out.println(contarPalabrasUnicas(texto));

    }
    public boolean tieneDuplicados(int [] numeros){
        boolean tieneDuplicados = true;
           Set<Integer> numDup = new LinkedHashSet<>();
           for (int numero : numeros){
                numDup.add(numero);
            }
            if (numeros.length == numDup.size()){
                return true;
            }else{
                return false;
            }

    }

   public static boolean isIsograma(String palabra) {
    Set<Character> letras = new HashSet<>();
    
    for (char c : palabra.toLowerCase().toCharArray()) {
        if (letras.contains(c)) {
            return false; 
        }
        letras.add(c);
    }
    return true; 


    }


    public int contarPalabrasUnicas(String frase){
        Set<String> palabrasUnicas = new HashSet<>();
        int cont = 0;
        for(String palabra : frase.split(" ")){
            if (palabrasUnicas.add(palabra)){
                cont++;
            }


        }
        return cont;
    }


}

