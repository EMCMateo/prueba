public class ArbolBinario {

 private Nodo raiz;
 
 public ArbolBinario(){

 }

 public void insertar(int valor){
    raiz = insertarRec(raiz, valor);
 }

 private Nodo insertarRec(Nodo actual, int valor){
    if (actual == null){
        return new Nodo(valor);
    }
    if (valor < actual.getValor()){
        actual.setIzq(insertarRec(actual.getIzq(), valor));
    }
    if (valor > actual.getValor()){
        actual.setDer(insertarRec(actual.getDer(), valor)); 
    }
    return actual;
 }

 public boolean buscar(int valor){
    return buscarRec(raiz, valor);
 }

 private boolean buscarRec(Nodo actual, int valor){
    if (actual == null){
        return false;
    }
    if (valor == actual.getValor()){
        return true;
    }
    if (valor < actual.valor) {
        return buscarRec(actual.izq, valor);
    }else {
        return buscarRec(actual.der, valor);
    }
    }

    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(Nodo actual) {
        if (actual != null) {
            inordenRec(actual.izq);
            System.out.print(actual.valor + " ");
            inordenRec(actual.der);
        }
    }


}
