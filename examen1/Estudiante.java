
public class Estudiante {
    private String nombre;
    private int edad;
    private Carrera carrera;
    public Estudiante(String nombre, int edad, Carrera carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public Estudiante(){

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Carrera getCarrera() {
        return carrera;
    }
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int getCarreraCarrera(){
        return carrera.getFacultad().getNombre().length();
    }

     public boolean CompareToEstudianteCarrera(Estudiante otroEstudiante){
        if(this.getCarreraCarrera() < otroEstudiante.getCarreraCarrera()){
            return true;
        }
        else{
            return false;
        }

        }
    
    public boolean CompareToEstudianteCarrera(String facultadBuscada){
            // Compara el nombre de la facultad del estudiante con el nombre de la facultad buscada
            // y devuelve true si son iguales, false en caso contrario.
            if(this.getCarrera().getFacultad().getNombre().equalsIgnoreCase(facultadBuscada)){
                return true;
            }
            return false;
            }
    

    @Override
    public String toString(){
        return "Estudiante: " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera.toString() + '\'';
    }

    
    
}
