package servicio;

import java.util.HashMap;
import java.util.Scanner;
import entidad.Producto;


/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */

public class ProductoService {

    private HashMap<String, Producto> productoMap;
    private Scanner leer;

    public ProductoService() {
        this.productoMap = new HashMap<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

public void cargarProducto(){
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto");
            Double precio = leer.nextDouble();
            productoMap.put(nombre, new Producto(nombre,precio));

        }
        public void modificarPrecio(){
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next();
            if (productoMap.containsKey(nombre)) {
                System.out.println("Ingrese el nuevo precio del producto");
                Double precio = leer.nextDouble();
                productoMap.get(nombre).setPrecio(precio);
                System.out.println("Precio modificado con exito");
            }else{
                 System.out.println("El producto no existe ");
            }

        }
        public void eliminarProducto(){
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next();
        if (productoMap.containsKey(nombre)) {
            productoMap.remove(nombre);
            System.out.println("Producto eliminado con exito");
        }else{
            System.out.println("Fallo al eliminar el producto / El producto no existe");
        }


    }
    public void mostrarProductos(){
        for (Producto producto : productoMap.values()) {
            System.out.println(producto);
        }   System.out.println("Productos en la tienda:");

    }
    public void menu(){
        int opcion;
        do{
            System.out.println("*********MENU*********");
            System.out.println("1. Cargar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.println("Digite la opcion deseada");
             opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cargarProducto();
                    System.out.println("Producto cargado con exito");
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        }while(opcion!=5);



    }

}