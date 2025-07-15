package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        empleados = new HashMap<>();
    }

    @Override
     public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void delete(int id)  {
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    }

    @Override
    public void list() {
       for (Map.Entry<Empleado, Empleado> entry : empleados.entrySet()) {
            Empleado key = entry.getKey();
            Empleado nombre = entry.getValue();
            System.out.println("ID: " + key.getId() + ", Nombre: " + nombre.getName());
        } 
    }
}
