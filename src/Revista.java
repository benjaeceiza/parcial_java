public class Revista extends Publicacion implements Prestamo {

    private int numeroEdicion;

    public Revista(String codigo, String titulo, int anioPublicacion, int numeroEdicion) {

        super(codigo, titulo, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    @Override

    public void mostrarDatos(){
        System.out.println("Revista: "+getTitulo()+" - Edicion N°: "+getNumeroEdicion()+" - Año: "+getAnioPublicacion());
    }

     public String tipoPrestamo() {
        return "Prestamo por 7 dias";
    }

}
