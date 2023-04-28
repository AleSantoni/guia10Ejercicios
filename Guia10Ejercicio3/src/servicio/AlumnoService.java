
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
 Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
promedio final, devuelto por el método y mostrado en el main

*/

public class AlumnoService {
    Scanner leer=new Scanner(System.in);
    
private List<Alumno> listaAlumnos; // creo la lista alumno en la clase service para poder trabajar

    public AlumnoService() {
        listaAlumnos = new ArrayList<>(); // creo el constructor del array
    }
  
    public void agregarAlumno() {
        do { // mediante un bucle pidos los datos para cargarlos al objeto 

        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = leer.next();

        List<Integer> notas = new ArrayList<>(); // creo una lista para cargar las notas 

        for (int i = 0; i <= 2; i++) {
            System.out.println("Ingrese la nota " +(i + 1) + " del alumno: ");
            int nota = leer.nextInt();
            notas.add(nota);
        }

        Alumno alumno = new Alumno(nombre,(ArrayList<Integer>) notas);//instancio el objeto pasandole como argumento nombre y el array con el tipo de dato que es 
        listaAlumnos.add(alumno); // cargo en la lista alumnos el objeto 


            System.out.println("¿Desea agregar otro alumno? (s/n)");
            String respuesta = leer.next();
            if(respuesta.equalsIgnoreCase("n"))
                break;


        } while (true);

    }

    public void notaFinal() {


        System.out.println("Ingrese el nombre del alumno a buscar: ");
        String nombreBuscado = leer.next(); 

        boolean encontrado = false; 

        for (Alumno alumno : listaAlumnos) { // recorro la lista alumno y compruebo si el nombre ingresado esta en la lista 
            if (alumno.getNombre().equals(nombreBuscado)) { // si esta
                int sumaNotas = 0;   

                for (int nota : alumno.getNotas()) { // recorro nota  lo traigo con el get y me suma las notas a medida que recorre la lista de notas 
                    sumaNotas += nota;
                }
                double promedio = sumaNotas / 3.0; // despues saco el promedio y lo muestro
                System.out.println("El promedio final del alumno " + alumno.getNombre() + " es " + promedio);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) { // si no se encontro la letra muestro el mensaje por pantalla 
            System.out.println("El alumno no se encuentra en la lista.");
        }
    }

}

