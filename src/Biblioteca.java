public class Biblioteca {

    public void ordenarPorAnio(Publicacion[] lista) {

        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - 1; j++) {
               if(lista[j].getAnioPublicacion()<lista[j+1].getAnioPublicacion()){
                   Publicacion aux = lista[j];
                   lista[j] = lista[j+1];
                   lista[j+1] = aux;
               }
            }
        }

        for (Publicacion publicacion : lista) {
             System.out.println("Titulo: "+ publicacion.getTitulo()+" -  Año de publicacion: "+publicacion.getAnioPublicacion());
        }

    }
    

    public Publicacion buscarPorTitulo(Publicacion[] lista, String titulo) {
        Publicacion encontrado = null;

        for(int i = 0; i<lista.length; i++){
            if(lista[i].getTitulo().equalsIgnoreCase(titulo)){
                encontrado = lista[i];
                break;
            }
        }

        return encontrado;
    }
}