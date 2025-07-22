import controllers.Graph;
import controllers.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mateo Molina ");

        Graph graph = new Graph();
        Node node1 = graph.addNode(0);
        Node node2 = graph.addNode(3);
        Node node3 = graph.addNode(5);

        Node node4 = graph.addNode(2);
        Node node5 = graph.addNode(4);
        Node node6 = graph.addNode(1);

        Node node7 = graph.addNode(7);
        Node node8 = graph.addNode(9);
        Node node9 = graph.addNode(8);

        graph.addEdge(node1, node3);
        graph.addEdge(node1, node2);
        graph.addEdge(node1, node6);
        graph.addEdge(node2, node4);
        graph.addEdge(node2, node5);
        graph.addEdge(node2, node8);
        graph.addEdge(node2, node7);
        graph.addEdge(node4, node6);
        graph.addEdge(node4, node9);
        graph.addEdge(node7, node9);

        graph.printGraphNeighbors();

    }
}
