    public class Carrera {
        private String nombre;
        private Facultad facultad;
        public Carrera(String nombre, Facultad facultad) {
            this.nombre = nombre;
            this.facultad = facultad;
        }

        public Carrera() {
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Facultad getFacultad() {
            return facultad;
        }

        public void setFacultad(Facultad facultad) {
            this.facultad = facultad;
        }

        @Override
        public String toString() {
            return "Carrera: " + nombre + ", " + facultad.toString();
        }

        

        
    }
