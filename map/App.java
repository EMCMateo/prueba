import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("MATEO EDUARDO MOLINA CHAMBA");
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencilloss
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
        EmpleadoDAO empleadoDAOHashMap = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoController = new EmpleadoContoller(empleadoDAOHashMap);


        EmpleadoDAO empleadoDAOTreeMap = new controllers.EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoControllerDos = new EmpleadoContoller(empleadoDAOTreeMap);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        empleadoController.crearEmpleado(emp1);
        empleadoController.crearEmpleado(emp2);
        empleadoController.crearEmpleado(emp3);
        empleadoController.crearEmpleado(emp4);
        empleadoController.crearEmpleado(emp5);


        empleadoControllerDos.crearEmpleado(emp1);
        empleadoControllerDos.crearEmpleado(emp2);
        empleadoControllerDos.crearEmpleado(emp3);
        empleadoControllerDos.crearEmpleado(emp4);
        empleadoControllerDos.crearEmpleado(emp5);

        empleadoController.listarEmpleados(null);

        System.out.println("-----------------------------------");
        empleadoControllerDos.listarEmpleados(null);

        Ejercicios ejercicios = new Ejercicios();
        int[] nums = {9, 2, 3, 6};
        int objetivo = 5;
        int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);

        ejercicios.contarCaracteres("hola");
        boolean sonAnagramas = ejercicios.sonAnagramas("roma", "amor");
        System.out.println("Son anagramas" + sonAnagramas);
        


    }

    private static void runEmpleadoExample() {

    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
        
    }

    private static void runEjerccios() {


    }
}
