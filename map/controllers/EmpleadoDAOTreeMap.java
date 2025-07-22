package controllers;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;
public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;
    public EmpleadoDAOTreeMap() {
        empleados = new TreeMap<>(); 

    }

   public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }


    public void delete(int id) {
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    }
    public void list() {
        for (Map.Entry<Empleado, Empleado> entry : empleados.entrySet()) {
            Empleado key = entry.getKey();
            Empleado value = entry.getValue();
            System.out.println("ID: " + key.getId() + ", Nombre: " + key.getName());
        }   
    }
}
