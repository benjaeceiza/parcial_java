public class Usuario {

    private String nombre;
    private Publicacion[] lista;

    public Usuario(String nombre, Publicacion[] lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    public Publicacion[] getLista() {
        return lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLista(Publicacion[] lista) {
        this.lista = lista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarPrestamos(Usuario usuario) {
      

        for (Publicacion u : usuario.lista) {
            System.out.println("Prestamo: "+ u.getTitulo());
        }
    }
}
