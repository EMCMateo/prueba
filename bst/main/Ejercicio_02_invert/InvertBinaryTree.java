package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    private Node root;

    public InvertBinaryTree(){
        this.root=null;
    }

    public Node invertTree(Node node) {
    if (node == null) {
        return null;
    }

    Node temp = node.getLeft();
    node.setLeft(invertTree(node.getRight()));
    node.setRight(invertTree(temp));

    return node;
}

}
