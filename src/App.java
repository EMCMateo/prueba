
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class App {
    public static void main(String[] args) throws Exception {
        /*
        ArbolBinario arbol = new ArbolBinario();

        int[] valores = {8, 3, 10, 1, 6, 14, 4, 7};
        for (int v : valores) arbol.insertar(v);

        System.out.println("Inorden:");
        arbol.inorden();  

        System.out.println("¿Contiene 6? " + arbol.buscar(6));
        System.out.println("¿Contiene 9? " + arbol.buscar(9));
        */
        
        
        Set<String> frutas = new HashSet<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Manzana"); // No se agrega de nuevo

        System.out.println(frutas);  // [Manzana, Banana]
        System.out.println(frutas.contains("Banana"));  // true
        frutas.remove("Banana");
        System.out.println(frutas.size());  // 1

        for (String fruta : frutas) {
        System.out.println(fruta);
        }



        int[] datos = {4, 5, 6, 4, 7, 5, 8, 9, 6};
        int cont = 0;
        Set<Integer> numeros = new HashSet<>();
        for (int dato : datos){
            numeros.add(dato);
        }
        System.out.println(numeros);
        for (int numero : numeros){
            cont++;
            if (!numeros.contains(numero)){
                cont--;
            }

        }
        System.out.println(cont);

        if (numeros.contains(10)){
            System.out.println("10 esta en el conjunto");
        }else{
            System.out.println("10 No está en el conjunto");
        }

        numeros.remove(4);
        System.out.println(numeros);








































        HashMap<String, Integer> productos = new HashMap<>();


        productos.put("Azucar", 15);
        productos.put("Arroz", 20);
        productos.put("Sal", 10);
        productos.put("Azucar", 30);

        System.out.println(productos);
        System.out.println(productos.containsKey("Harina"));
        productos.remove("Arroz");
        for (Map.Entry<String, Integer> entry : productos.entrySet() ){
            System.out.println("Producto: "+entry.getKey() + " Stock: " + entry.getValue());
        }
        

        String[] palabras = {"java", "c", "java", "python", "java", "c++", "c", "python"};

        HashMap<String, Integer> contador  = new HashMap<>();
        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    
                









        /*
        Map<String, Integer> edades = new HashMap<>();

        edades.put("Mateo", 20);
        edades.put("Lucía", 22);
        edades.put("Mateo", 21);  // Sobrescribe el valor

        System.out.println(edades.get("Mateo"));  // 21
        System.out.println(edades.containsKey("Pedro"));  // false
        System.out.println(edades.keySet());  // Todas las claves
        System.out.println(edades.values());  // Todos los valores

        for (Map.Entry<String, Integer> entry : edades.entrySet()) {
            System.out.println(entry.getKey() + " tiene " + entry.getValue() + " años.");
        }
        */


         System.out.println("/------------------------------------------------------------------------------/");
        //Extras: Registro de usuarios únicos (con orden)
        

        String[] logins = { "lucia", "mateo", "ana", "lucia", "pedro", "ana", "jose" };
        LinkedHashSet<String> loginOrdenDeEntrada = new LinkedHashSet<>();
        for (String usuarioNuevo : logins){
            loginOrdenDeEntrada.add(usuarioNuevo);

        }
        System.out.println(loginOrdenDeEntrada);


        TreeSet<String> loginAlfabetico = new TreeSet<>();
        for(String usuario : logins){
            loginAlfabetico.add(usuario);
        }
        System.out.println(loginAlfabetico);
        
            System.out.println("/------------------------------------------------------------------------------/");

        //Contador de palabras con orden de aparición
        String texto = "Java python Java C++ java python";

        LinkedHashMap<String, Integer> ordenDeAparicion = new LinkedHashMap<>();

        


         System.out.println("/------------------------------------------------------------------------------/");

        //Inventario Ordenado
        TreeMap<String, Integer> inventarioOrdenado = new TreeMap<>();


         inventarioOrdenado.put("Arroz", 50);
         inventarioOrdenado.put("Sal", 30);
         inventarioOrdenado.put("Azucar", 45);
         inventarioOrdenado.put("Avena", 20);

         inventarioOrdenado.put("Sal", 40);
         inventarioOrdenado.remove("Avena");

         for(Map.Entry<String, Integer> entry : inventarioOrdenado.entrySet()){
            System.out.println("Producto: " + entry.getKey() + " - Cantidad: " + entry.getValue());
         }

         System.out.println("/------------------------------------------------------------------------------/");

         //Conjuntos de Estudiantes:
         Set<String> claseA = new TreeSet<>(List.of("Mateo", "Ana", "Lucía", "Pedro"));
         Set<String> claseB = new TreeSet<>(List.of("Pedro", "José", "Ana", "Martha"));
         HashSet <String> interseccion = new HashSet<>();
         HashSet <String> diferencia = new HashSet<>();
         HashSet <String> union = new HashSet<>();

         for(String est : claseA){
            if(claseB.contains(est)){
                interseccion.add(est);
            }else{
                diferencia.add(est);
            }
            
         }


         System.out.println(interseccion);
         System.out.println(diferencia);

         union.addAll(claseA);
         union.addAll(claseB);
         System.out.println(union);

         
         System.out.println("/------------------------------------------------------------------------------/");

         TreeMap<Integer, String> tareas = new TreeMap<>();
         
         tareas.put(2, "Enviar Correo");
         tareas.put(1, "Revisar Codigo");
         tareas.put(3, "Documentar");
         tareas.put(1, "Llamar Cliente");
         
         for (Map.Entry<Integer, String> entry : tareas.entrySet()){
            System.out.println("Prioridad: " + entry.getKey() + " : " + entry.getValue());
         }



        



        
    }
}
