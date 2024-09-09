public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // Validación del año al inicializar
    }

    // Métodos Set (modificar atributos)
    public void setTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }

    public void setAutor(String nuevoAutor) {
        this.autor = nuevoAutor;
    }

    public void setAñoPublicacion(int nuevoAñoPublicacion) {
        if (nuevoAñoPublicacion >= 1440) {
            this.añoPublicacion = nuevoAñoPublicacion;
        } else {
            System.out.println("Error: El año de publicación no puede ser menor que 1440.");
        }
    }

    // Métodos Get (obtener atributos)
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    // Método para imprimir la información del libro
    public void imprimirInfo() {
        System.out.printf("Título: %s, Autor: %s, Año de Publicación: %d%n", 
                          getTitulo(), getAutor(), getAñoPublicacion());
    }

    // Main para pruebas
    public static void main(String[] args) {
        // Crear instancias de libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", 1605);

        // Imprimir la información inicial de los libros
        System.out.println("Información inicial:");
        libro1.imprimirInfo();
        libro2.imprimirInfo();

        // Modificar la información de los libros
        libro1.setTitulo("Cien años de soledad (Edición Revisada)");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setAñoPublicacion(1970);

        libro2.setTitulo("Don Quijote de la Mancha");
        libro2.setAutor("Miguel de Cervantes Saavedra");
        libro2.setAñoPublicacion(1608);

        // Imprimir la información actualizada de los libros
        System.out.println("\nInformación actualizada:");
        libro1.imprimirInfo();
        libro2.imprimirInfo();
    }
}
