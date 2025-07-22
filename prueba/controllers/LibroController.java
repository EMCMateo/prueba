package controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Book;

public class LibroController {

    public Set<Book> procesarConTreeSet(List<Book> libros) {
        // return new TreeSet<>(libros);

        return null;
    }

    public Map<Book, Book> procesarConTreeMap(List<Book> libros) {
        Map<Book, Book> mapa = new TreeMap<>();
        for (Book libro : libros) {
            mapa.put(libro, libro);
        }
        return mapa;

    }

}
