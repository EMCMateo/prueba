package main.Ejercicio_03_listLeves;

import java.util.*;
import main.Materia.Models.Node;

public class ListLevels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> resultado = new ArrayList<>();
        if (root == null) {
            return resultado;
        }

        Queue<Node> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            int size = cola.size();

            List<Node> nivelActual = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                Node actual = cola.poll();
                nivelActual.add(actual);
                

                if (actual.getLeft() != null) cola.add(actual.getLeft());
                
                if (actual.getRight() != null) cola.add(actual.getRight());
            }

            resultado.add(nivelActual);
        }

        return resultado;
    }
}
