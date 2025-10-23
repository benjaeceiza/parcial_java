public class Publicacion {
    private String codigo;
    private String titulo;
    private int anioPublicacion;

    public Publicacion(String codigo, String titulo, int anioPublicacion){
            
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void mostrarDatos(){
        
        System.out.println("Publicacion: "+getCodigo()+" - "+getTitulo()+" - año: "+getAnioPublicacion());
    }
}