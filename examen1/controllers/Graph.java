package controllers;
import java.util.HashSet;
import java.util.Set;


public class Graph{
    private Set<Node> nodos;

    public Graph(){
        this.nodos = new HashSet<>();
    }

    public Node addNode(int value) {
        Node newNode = new Node(value);
        nodos.add(newNode);
        return newNode;     
        

    }
    //Añadir destino
    public void addEdge(Node src, Node dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src); 

    }

    public void addEdgeUnidirectional(Node src, Node dest) {
        src.addNeighbor(dest);
    }

    public void printGraphNeighbors() {
        for (Node node : nodos) {
            System.out.println();
            System.out.println("Nodo: " + node.getValue() + " vecinos: ");
            for (Node neighbor : node.getNeighbors()) {
                System.out.print(neighbor.getValue() + " ");
            }
        }
    }
    
    public void printGraph() {
        for (Node node : nodos) {
            System.out.println(node);
        }
    }
    
    public void getDFS(Node startNode) {
        
    }

    private void getDFSUtil(Node node, boolean[] visited) {
    
        
    }
    public void getBFS(Node startNode) {
        
    }

    public int [] [] getAdjacencyMatrix() {
        return new int[nodos.size()][nodos.size()];
    
    }

    public void printAdjacencyMatrix() {
    
    }

}