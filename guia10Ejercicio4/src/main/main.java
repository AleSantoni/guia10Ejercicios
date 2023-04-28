
package main;

import servicio.PeliculaServer;


public class main {

    
    public static void main(String[] args) {
        PeliculaServer ps = new PeliculaServer();
        ps.guardarPelicula();
        System.out.println("Mostrando Lista de Peliculas Cargadas");
        ps.mostrarPeliculas();
        System.out.println("***************************************************");
        System.out.println("Lista de peliculas con duracion superior a 1 hora ");
        ps.duracionMayoraunaHora();
        System.out.println("***************************************************");
        System.out.println("Lista ordenada por Duracion ");
       ps.ordenarPeliculaporDuracion();
        System.out.println("***************************************************");
        System.out.println("Lista ordenada alfabeticamente por Titulo ");
        ps.ordenarPeliculasPorTitulo();
        System.out.println("Lista ordenada alfabeticamente por Director ");
        ps.ordenarPeliculasPorDirector();

    }

}
