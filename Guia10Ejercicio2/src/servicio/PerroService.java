/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
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
    
    // eliminamos un elemento del array con un Iterator
    public void eliminarElemento(){
        
        System.out.println("Digite la raza del perro a eliminar de la lista ");
        String eliminar=leer.next();
        Iterator<String> it=listaRaza.iterator();// creo un objeto iterator para eliminar en la lista  
        
       
            while(it.hasNext()){
                if(it.next().equalsIgnoreCase(eliminar)){
                    it.remove();
                }
            }
        }
  
    
}
    

