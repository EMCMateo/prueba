public class Facultad {
    private String nombre;

    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    public Facultad(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Facultad: " + nombre;
    }
    
}
