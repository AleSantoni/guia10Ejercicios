
package guia10ejercicio2;

import servicio.PerroService;



/**
 *Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada.
 * @author BeluS
 */
public class main {

    
    public static void main(String[] args) {
               PerroService ps=new PerroService();
               ps.cargarLista();
               ps.mostrarRaza();
               ps.eliminarElemento();
               System.out.println("La Lista nueva es :");
               ps.mostrarRaza();
             
               
        
}
    
}

