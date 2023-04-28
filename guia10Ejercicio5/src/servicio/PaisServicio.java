
package servicio;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import entidad.Pais;
import java.util.TreeSet;



public class PaisServicio {
   

    private HashSet<String> paises;


    public PaisServicio() {

        this.paises = new HashSet<>();

    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
    Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
    usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
    conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
    si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
    los servicios en la clase correspondiente)
     */
    public void agregarPais() {

        do {
            System.out.println("Ingrese un país");
            String nombre = leer.next();
            Pais nombrePais = new Pais(nombre);
            paises.add(nombrePais.getNombre());

            System.out.println("Desea agregar otro país? s/n");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        } while (true);
        for (String pais : paises) {
            System.out.println("- " + pais);
        }


    }
    /*
    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
     */

    public void mostrarPaisesOrdenados() {
        TreeSet<String> paisesOrdenados = new TreeSet<>(paises); // creo un treeset y le paso como argumento el conjunto
        System.out.println("Paises ordenados alfabéticamente:");

        for (String pais : paisesOrdenados) {
            System.out.println("- " + pais);
        }

    }

    /*
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
     */
    public void eliminarPais() {
        System.out.println("***************************************************");

        
        System.out.println("Ingrese un país");
        String nombre = leer.next();
        Iterator<String> it = paises.iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(nombre)) {
                    System.out.println("Se procedera a remover el pais elegido");
                    it.remove();
                    System.out.println("Removido con exito");
                    break;
                } else {
                    System.out.println("Fallo al remover el pais, No se encontro el pais en el conjunto");
                    break;
                }
            }
        System.out.println("");
        System.out.println("La Nueva Lista de Paises es");
        for (String pais : paises) {
            System.out.println("- " + pais);
        }
    }
}

    

