package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
    }

    public void ejemploConHashMap() {
        Map <String,String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Perú", "Lima");
        capitales.put("Colombia", "Bogotá");
        
        System.out.println(capitales.keySet());
        for (String pais : capitales.keySet()){
            System.out.println("Pais:" + pais + " Capital: "+ capitales.get(pais));
        }
        //Ejemplo acceso directo
        String capital = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: " + capital);


        Map <Integer, Empleado> empleados = new HashMap<>();
        empleados.put(1,new Empleado(3, "Pedro", "Tester") );
        empleados.put(2, new Empleado(1, "Ana", "Dev") );
        empleados.put(3, new Empleado(2, "Luis", "Diseñador") );
        empleados.put(4, new Empleado(4, "Mateo", "Dev Senior") );
        empleados.put(5, new Empleado(5, "Juan", "Tester") );
        empleados.put(6 ,new Empleado(6, "Roberto Firmino", "Striker") );

        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()){
            System.out.println("ID: " + entry.getKey() + " Valor: "+ entry.getValue() );
        }
        
    }

    public void ejemploConLinkedHashMap() {
        Map <String, Integer> productos = new LinkedHashMap<>();
        productos.put("Balon", 8);
        productos.put("Gafas", 10);
        productos.put("Bote", 1);
        productos.put("Tanque", 5);
        productos.put("Piscina Inflable", 2);
        productos.put("Caña", 20);

        Map<Empleado, Integer> empleadoDos = new TreeMap<>();
        Empleado emp1 = new Empleado(0, "Pedro", "Dev");
        Empleado emp2 = new Empleado(2, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Ana", "Dev");
        Empleado emp4 = new Empleado(1, "Ana", "Dev");

        empleadoDos.put(emp1, 1000);
        empleadoDos.put(emp2, 1200);
        empleadoDos.put(emp3, 1500);
        empleadoDos.put(emp4, 1500);

        for (Map.Entry<Empleado,Integer> entry : empleadoDos.entrySet()){
            System.out.println(entry.getKey() + "==>>" + entry.getValue()) ;
        }
        
        
    }

        


    

    public void ejemploConTreeMap() {   
        Map<Integer, String> personas = new TreeMap<>();
        personas.put(1, "Juan");
        personas.put(2, "Luis");
        personas.put(3, "Mateo");
        personas.put(4, "José");
        personas.put(5, "Lima");
        personas.put(6 , "Polo");

        for (Integer id : personas.keySet()){
            System.out.println("ID: " + id + " Persona: " + personas.get(id) );
        }

        Map<Empleado, Integer> empleadoDos = new HashMap<>();
        Empleado emp1 = new Empleado(0, "Pedro", "Dev");
        Empleado emp2 = new Empleado(2, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Ana", "Dev");
        Empleado emp4 = new Empleado(1, "Ana", "Dev");

        empleadoDos.put(emp1, 1000);
        empleadoDos.put(emp2, 1200);
        empleadoDos.put(emp3, 1500);
        empleadoDos.put(emp4, 1500);

        for (Map.Entry<Empleado,Integer> entry : empleadoDos.entrySet()){
            System.out.println(entry.getKey() + "==>>" + entry.getValue()) ;
        }

    }


}
