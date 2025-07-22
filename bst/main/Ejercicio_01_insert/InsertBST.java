package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {
    private Node root;
    
    public InsertBST() {
        this.root = null;
    }

    public Node insert(Node padre, int value) {
        if (padre == null) {
            return new Node(value);
        }
        if (value < padre.getValue()) {
            padre.setLeft(insert(padre.getLeft(), value));
        } else if (value > padre.getValue()) {
            padre.setRight(insert(padre.getRight(), value));
        }
        return padre;
    }


    public void imprimirArbolInOrder() {
        imprimirInOrder(this.root);
    }

    public void imprimirArbolInOrder(Node nodo) {
        imprimirInOrder(nodo);
    }

    private void imprimirInOrder(Node node) {
        if (node != null) {
            imprimirInOrder(node.getLeft());
            System.out.print(node.getValue() + ", ");
            imprimirInOrder(node.getRight());
        }
    }
}
