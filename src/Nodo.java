public class Nodo {
    int valor;
    Nodo izq, der;

    Nodo(int valor) {
        this.valor = valor;
        izq = der = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public Nodo getDer() {
        return der;
    }

    

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + valor;
        result = prime * result + ((izq == null) ? 0 : izq.hashCode());
        result = prime * result + ((der == null) ? 0 : der.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Nodo other = (Nodo) obj;
        if (valor != other.valor)
            return false;
        if (izq == null) {
            if (other.izq != null)
                return false;
        } else if (!izq.equals(other.izq))
            return false;
        if (der == null) {
            if (other.der != null)
                return false;
        } else if (!der.equals(other.der))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Nodo [valor=" + valor + ", izq=" + izq + ", der=" + der + "]";
    }

    
}