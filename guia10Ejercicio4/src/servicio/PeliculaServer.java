
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PeliculaServer {
    
    private List<Pelicula> listaPelicula=new ArrayList<>();
    
    private Scanner leer;

    public PeliculaServer() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPelicula = new ArrayList<>();
    }
    
    /*
    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
crear otra Pelicula o no.
    */
    public void guardarPelicula(){
        
        do{
            System.out.println("Digite el nombre de la Pelicula->");
        String nombre=leer.next();
        System.out.println("Digite el director de la Pelicula->");
        String director=leer.next();
        System.out.println("Digite la duracion en horas de la pelicula ");
        double duracion=leer.nextDouble();
        Pelicula pelicula =new Pelicula(nombre, director, duracion);
        listaPelicula.add(pelicula);
            System.out.println("Quiere agregar otra pelicula Digite S/N");
            String respuesta=leer.next();
            if(respuesta.equalsIgnoreCase("N"))
                break;
            
        }while (true);

    }
    /*
    Después de ese bucle realizaremos las siguientes acciones: 

• Mostrar en pantalla todas las películas.
    */
    public void mostrarPeliculas(){
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula);
            
        }
            
    }
    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    
    public void duracionMayoraunaHora(){
          for (Pelicula pelicula : listaPelicula) {
              if(pelicula.getDuracion()>1){
                  System.out.println(pelicula);
              }
              
          }
    }
    /*
     /*
       Dentro de sort, se utiliza una expresión lambda (p1, p2) -> Double.compare(p2.getDuracion(), p1.getDuracion()) 
        para comparar dos objetos Pelicula. 
        La expresión lambda es una función anónima que se utiliza para implementar la interfaz funcional Comparator.

La expresión lambda toma dos objetos Pelicula como entrada (p1 y p2) y devuelve un valor entero que
        indica si p1 es mayor, igual o menor que p2. En este caso, se utiliza el método compare de la clase Double para comparar 
        las duraciones de las películas (p1.getDuracion() y p2.getDuracion()) en orden descendente.
        Si la duración de p2 es mayor que la duración de p1, la expresión lambda devuelve un valor negativo, 
        lo que indica que p2 debe ir antes que p1 en la lista ordenada. Si las duraciones son iguales, la expresión 
        lambda devuelve 0, y si la duración de p1 es mayor que la duración de p2, devuelve un valor positivo,
        lo que indica que p1 debe ir antes que p2 en la lista ordenada.
        */
   
       /*
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.

    public void ordenarPeliculas() {
        listaPelicula.sort((p1, p2) -> Double.compare(p2.getDuracion(), p1.getDuracion()));
        mostrarPeliculas();
        }
*/
    public void ordenarPeliculaporDuracion() {
        listaPelicula.sort(Pelicula.comparadorDuracion);
        mostrarPeliculas();

    }

    /* • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPeliculasPorTitulo() {
        listaPelicula.sort((p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
        mostrarPeliculas();
    }
    */
    public void ordenarPeliculasPorTitulo() {
        listaPelicula.sort(Pelicula.comparadorTitulo);
        mostrarPeliculas();
    }
    /*• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
    public void ordenarPeliculasPorDirector() {
        listaPelicula.sort((p1, p2) -> p1.getDirector().compareTo(p2.getDirector()));
        mostrarPeliculas();
    }

    }

     */
    public void ordenarPeliculasPorDirector() {
        listaPelicula.sort(Pelicula.comparadorDirector);
        mostrarPeliculas();
    }
}
