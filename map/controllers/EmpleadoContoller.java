package controllers;

import java.util.Map;
import models.Empleado;

public class EmpleadoContoller {
    private EmpleadoDAO empleadoDAO;
    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;

    }


    public void crearEmpleado(Empleado empleeado) {
        empleadoDAO.add(empleeado);
        System.out.println("Empleado creado exitosamente: " + empleeado);
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.delete(id);

    }

    public void listarEmpleados(Map<Integer, Empleado> empleados) {
        empleadoDAO.list();
    }




}