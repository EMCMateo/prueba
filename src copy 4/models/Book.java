package models;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    // Ordenar
    @Override
    public int compareTo(Book otro) {
        int cmp = otro.titulo.compareTo(this.titulo);
        if (cmp != 0)
            return cmp;
        return Integer.compare(anio, otro.anio);
    }

    @Override
    public String toString() {
        return String.format("%s - %s (%d)", titulo, autor, anio);
    }
}
