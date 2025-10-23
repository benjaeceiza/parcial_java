public class App {
    public static void main(String[] args) throws Exception {

        Publicacion p1 = new Publicacion("10A1H4", "El corredor del laberinto", 2021);
        Revista r1 = new Revista("15HB31", "Super moda", 2023, 25);
        Libro l1 = new Libro("HSD98", "Harry potter", 2005, "J.k Rouwling");

        Publicacion[] publicaciones = { p1, r1, l1 };

        // Herencia y poliformismo
        for (Publicacion publicacion : publicaciones) {
            publicacion.mostrarDatos();
        }

        // Interfaz
        System.out.println("----------------------------");
        System.out.println(l1.tipoPrestamo());
        System.out.println(r1.tipoPrestamo());

        // Ordenamiento y busqueda
        System.out.println("---------------------------------");
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.ordenarPorAnio(publicaciones);

        System.out.println("---------------------------------");

        Publicacion encontrado = biblioteca.buscarPorTitulo(publicaciones, "super moda");

        // Devuelve el mensaje dependiendo si encontro o no el objeto.
        if (encontrado != null) {
            System.out.println("Publicacion encontrada: " + encontrado.getTitulo() + " - Año de publicacion: "
                    + encontrado.getAnioPublicacion());
        } else {
            System.out.println("Lo siento, Publicacion no encontrada!");
        }

        // Punto 5

        Usuario usuario1 = new Usuario("Benjamin", publicaciones);

        System.out.println("--------------------------------");
        System.out.println("Prestamos activos: ");
        usuario1.mostrarPrestamos(usuario1);

    }
}
