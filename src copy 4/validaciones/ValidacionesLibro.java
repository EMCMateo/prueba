// package validaciones;

// import models.Book;

// import java.util.Map;
// import java.util.Set;

// import static org.junit.jupiter.api.Assertions.*;

// public class ValidacionesLibro {

// public static void validarResultadoTreeSet(Set<Book> resultado) {
// assertEquals(25, resultado.size(),
// "TreeSet debe contener exactamente 25 elementos únicos según compareTo");

// assertTrue(resultado.stream().anyMatch(b -> b.getTitulo().equals("Java
// Básico")),
// "Debe contener el libro 'Java Básico'");
// assertTrue(resultado.stream().anyMatch(b -> b.getTitulo().equals("Python
// desde cero")),
// "Debe contener el libro 'Python desde cero'");
// }

// public static void validarResultadoTreeMap(Map<Book, Book> resultado) {
// assertEquals(25, resultado.size(),
// "TreeMap debe contener exactamente 25 elementos únicos según compareTo");

// assertTrue(resultado.containsKey(new Book("Java Básico", "Luis Pérez",
// 2021)),
// "Debe contener la clave 'Java Básico', 'Luis Pérez', 2021");
// assertTrue(resultado.containsKey(new Book("Fundamentos", "Luis Pérez",
// 2014)),
// "Debe contener la clave 'Fundamentos', 'Luis Pérez', 2014'");
// }
// }
