package controllers;
import models.Empleado;
public interface EmpleadoDAO {

    public void add (Empleado empleado);

    public void delete(int id);

    public void list();
    
}
