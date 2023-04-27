package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;



public class PerroService {
    
    private  ArrayList<String> listaRaza;

    public PerroService() {
        this.listaRaza = new ArrayList();
    }
    
    Scanner leer= new Scanner(System.in);


    public void  cargarLista(){
        
        do{
            System.out.println("Digite la raza del Perro");
            String raza=leer.next();
            Perro perro=new Perro(raza);
            listaRaza.add(perro.getRaza());
            System.out.println("Desea cargar la raza de otro perro S/N");
            String respuesta =leer.next();
            if(respuesta.equalsIgnoreCase("N")){
                break;
            }
            
            
            
            
            
            
            
        }while(true);
        
        
        
        
        
    }
    public void mostrarRaza(){
        System.out.println("La Lista de raza de los Perros es ");
        for (String aux: listaRaza) {
            System.out.println(aux);
            
        }
        
    }
    
    
}

