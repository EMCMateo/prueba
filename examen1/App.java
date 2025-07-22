import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];
        estudiantes[0] = new Estudiante("Juan", 20, new Carrera("Ciencias de la Computación", new Facultad("Ingenieria")));
        estudiantes[1] = new Estudiante("Ana", 26, new Carrera("Ingeniería Civil", new Facultad("Ingenieria")));
        estudiantes[2] = new Estudiante("Mateo", 19, new Carrera("Medicina", new Facultad("Salud")));
        estudiantes[3] = new Estudiante("David", 80, new Carrera("Contabilidad", new Facultad("Economía")));
        estudiantes[4] = new Estudiante("Pedro", 30, new Carrera("Música", new Facultad("Artes")));

        Scanner leer = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.print("Ingrese la facultad a buscar: ");
        String facultadBuscada = leer.nextLine();

        // Puedes alternar el algoritmo que quieras usar
        EstudianteController.ordenarPorFacultadInsertion(estudiantes);
        // new EstudianteController().ordenarPorFacultadMerge(estudiantes, 0, estudiantes.length - 1);

        // Mostrar resultados de la búsqueda
        System.out.println("\nEstudiantes de la facultad buscada:");
        System.out.println(EstudianteController.buscarPorFacultad(estudiantes, facultadBuscada));

        leer.close();
    }
}
