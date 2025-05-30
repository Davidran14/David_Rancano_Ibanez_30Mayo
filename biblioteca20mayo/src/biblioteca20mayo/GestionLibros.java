package biblioteca20mayo;

/***
 * Clase para gestionar una colección simple de libros.
 * 
 * @author David
 * @version 1.0
 */
public class GestionLibros {
    
    /** 
     * Máximo número de libros que se pueden almacenar.
     */
    private static final int MAX_LIBROS = 5;
    
    /**
     * Array que almacena los títulos de los libros.
     */
    private static String[] libros = new String[MAX_LIBROS];
    
    /**
     * Contador del número de libros almacenados.
     */
    private static int contador = 0;
    
    /**
     * Método principal para probar las funcionalidades de la clase.
     * 
     * @param args Parámetros del programa (no se usan).
     */
    public static void main(String[] args) {
        añadirLibro("Don Quijote");
        añadirLibro("Cien años de soledad");
        añadirLibro("El principito");

        System.out.println("Total de libros: " + contarLibros());

        int indice = buscarLibro("El principito");
        if (indice != -1) {
            System.out.println("Libro encontrado en índice " + indice + ": " + mostrarLibro(indice));
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    /**
     * Añade un libro a la colección si hay espacio.
     * 
     * @param titulo El título del libro a añadir.
     * @return true si se añadió el libro correctamente; false si se alcanzó el máximo.
     */
    public static boolean añadirLibro(String titulo) {
        if (contador < MAX_LIBROS) {
            libros[contador] = titulo;
            contador++;
            return true;
        }
        return false;
    }

    /**
     * Busca un libro por título en la colección.
     * 
     * @param titulo El título del libro a buscar.
     * @return El índice del libro si se encuentra; -1 si no se encuentra.
     */
    public static int buscarLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i].equalsIgnoreCase(titulo)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Cuenta el número de libros.
     * 
     * @return El número de libros actual
     * .
     */
    public static int contarLibros() {
        return contador;
    }

    /**
     * Muestra el título del libro en el índice indicado.
     * 
     * @param indice La posición del libro.
     * @return El título del libro si el índice es válido; mensaje de error si no.
     */
    public static String mostrarLibro(int indice) {
        if (indice >= 0 && indice < contador) {
            return libros[indice];
        } else {
            return "Índice fuera de rango";
        }
    }
}

