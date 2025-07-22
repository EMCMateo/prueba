public class EstudianteController {
    public static void ordenarPorFacultadSelection(Estudiante[] estudiantes) {
        Estudiante aux;
        int indiceMax = 0;
        for (int i = 0; i<estudiantes.length-1; i++){
            indiceMax = i;
            for (int j=i+1; j<estudiantes.length;j++){
                if(estudiantes[indiceMax].CompareToEstudianteCarrera(estudiantes[j]) == true){
                    indiceMax = j;
                }
            }
            if (indiceMax != i ){
                aux = estudiantes[indiceMax];
                estudiantes[indiceMax] = estudiantes[i];
                estudiantes[i] = aux;
            }
            
        }
        imprimirEstudiantes(estudiantes);

    }

    public static void ordenarPorFacultadBubble(Estudiante[] estudiantes) {
        Estudiante aux;
        for (int i = 0; i < estudiantes.length - 1; i++) {
            for (int j = 0; j < estudiantes.length - 1 - i; j++) {
                if (estudiantes[j].CompareToEstudianteCarrera(estudiantes[j + 1]) == true) {
                    aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;
                }
            }
        }
        imprimirEstudiantes(estudiantes);

    }

    public static void ordenarPorFacultadInsertion(Estudiante[] estudiantes) {
        Estudiante aux;
        for (int i = 1; i < estudiantes.length; i++) {
            aux = estudiantes[i];
            int j = i - 1;
            while (j >= 0 && estudiantes[j].CompareToEstudianteCarrera(aux) == true) {
                estudiantes[j + 1] = estudiantes[j];
                j--;
            }
            estudiantes[j + 1] = aux;
        }
        imprimirEstudiantes(estudiantes);
    }

    public static void imprimirEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());
        }
    }






    public void ordenarPorFacultadMerge(Estudiante[] estudiantes, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;
            ordenarPorFacultadMerge(estudiantes, inicio, medio);
            ordenarPorFacultadMerge(estudiantes, medio + 1, fin);
            merge(estudiantes, inicio, medio, fin);
        }
    }

    private void merge(Estudiante[] estudiantes, int inicio, int medio, int fin) {
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;

        Estudiante[] izquierda = new Estudiante[n1];
        Estudiante[] derecha = new Estudiante[n2];

        for (int i = 0; i < n1; i++) {
            izquierda[i] = estudiantes[inicio + i];
        }
        for (int j = 0; j < n2; j++) {
            derecha[j] = estudiantes[medio + 1 + j];
        }

        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            if (izquierda[i].CompareToEstudianteCarrera(derecha[j]) == true) {
                estudiantes[k] = izquierda[i];
                i++;
            } else {
                estudiantes[k] = derecha[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            estudiantes[k] = izquierda[i];
            i++;
            k++;
        }

        while (j < n2) {
            estudiantes[k] = derecha[j];
            j++;
            k++;
        }
    }

    public static String buscarPorFacultad(Estudiante[] estudiantes, String facultadBuscada) {
        StringBuilder resultado = new StringBuilder();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCarrera().getFacultad().getNombre().equalsIgnoreCase(facultadBuscada)) {
                resultado.append(estudiante.toString()).append("\n");
            }
        }
        return resultado.toString();
    }

    /* 
     public static int findByFacultad(Estudiante [] estudiantes, String facultadBuscada){
        int inicio = 0;
        int fin = estudiantes.length-1;
        while (inicio <= fin){
            int centro = (inicio + fin)/2;
            int valorC =  estudiantes[centro].getCarreraCarrera();
            String codigo = estudiantes[centro].getCarrera().getFacultad().getNombre();
            if (codigo.equalsIgnoreCase(facultadBuscada)){
                return centro;
            } else if (valorC < facultadBuscada.length()) {
                inicio = centro + 1;
            } else {
                fin = centro - 1;
            }
            return -1; // No se encontró la facultad
            

    }
}
     */


}
