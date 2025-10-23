public class Libro extends Publicacion implements Prestamo {

    private String autor;

    public Libro(String codigo, String titulo, int anioPublicacion, String autor) {
        super(codigo, titulo, anioPublicacion);
        this.autor = autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override

    public void mostrarDatos() {
        System.out.println("Libro: " + getTitulo() + " - Autor: " + getAutor() + " - Año: " + getAnioPublicacion());
    }

    @Override
    
    public String tipoPrestamo() {
        return "Prestamo por 15 dias";
    }
}
