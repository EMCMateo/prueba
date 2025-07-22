package controller;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Sets{

public Sets(){
}

public Set<String> construirHashSet(){
    Set<String> palabras = new HashSet<>();
    palabras.add("laptop");
    palabras.add("manzana");
    palabras.add("pera");
    palabras.add("celular");
    palabras.add("laptop");
    palabras.add("pera");
    palabras.add("laptop");
    return palabras;
}


public Set<String> construirLinkedHashSet(){
    Set<String> palabras = new LinkedHashSet<>();
    palabras.add("laptop");
    palabras.add("manzana");
    palabras.add("pera");
    palabras.add("celular");
    palabras.add("laptop");
    palabras.add("pera");
    palabras.add("laptop");
    return palabras;
}



public Set<String> construirTreeSet(){
    Set<String> palabras = new TreeSet<>();
    palabras.add("laptop");
    palabras.add("manzana");
    palabras.add("pera");
    palabras.add("celular");
    palabras.add("laptop");
    palabras.add("pera");
    palabras.add("laptop");
    return palabras;

}

public Set<String> construirTreeSetConComparador(){



    //Crear Comparador:
    Comparator<String> comparadorLongitud = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2){
            //Comparar longitud
            int resultado = Integer.compare(s1.length(), s2.length());
            
            //Si tienen la mismca longitud comparar alfabeticamente
            if( resultado == 0){
                return s1.compareTo(s2);

            }

            return resultado;
    };
    };

    Set<String> treeSetComparador = new TreeSet<>(comparadorLongitud);
    treeSetComparador.add("laptop");
    treeSetComparador.add("manzana");
    treeSetComparador.add("pera");
    treeSetComparador.add("celular");
    treeSetComparador.add("laptop");
    treeSetComparador.add("pera");
    treeSetComparador.add("laptop");
    treeSetComparador.add("celulas");
    return treeSetComparador;

}

public Set<String> construirTreeSetConComparadorAlfabetico(){



    //Crear Comparador:
    Comparator<String> comparadorAlfabetico = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2){
        
                int resultado = Integer.compare(s2.length(), s1.length());
            
            //Si tienen la mismca longitud comparar alfabeticamente
            if( resultado == 0){
                return s2.compareTo(s1);

            }

            return resultado;
            
    };
    };

    Set<String> treeSetComparadorAlfabetico = new TreeSet<>(comparadorAlfabetico);
    treeSetComparadorAlfabetico.add("laptop");
    treeSetComparadorAlfabetico.add("manzana");
    treeSetComparadorAlfabetico.add("pera");
    treeSetComparadorAlfabetico.add("celular");
    treeSetComparadorAlfabetico.add("laptop");
    treeSetComparadorAlfabetico.add("pera");
    treeSetComparadorAlfabetico.add("laptop");
    treeSetComparadorAlfabetico.add("celulas");
    return treeSetComparadorAlfabetico;

}
}

