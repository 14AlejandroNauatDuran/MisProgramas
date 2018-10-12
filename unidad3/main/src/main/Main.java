/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Admin
 * Nauat duran alejandro
 * pomol couoh israel
 * chi canche omar alexis
 * pool diaz angel enrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Nodo primero = new Nodo("ejemplo"); //de esta manera creamos a los nodos y les añadimos un valor
         Nodo segundo = new Nodo(234);
         Nodo tercero = new Nodo("Profe Leonel");
         Nodo cuarto = new Nodo(55);
         
         primero.enlazarSiguiente(segundo);// estamos enlazando nodos
         primero.ObtenerSiguiente().enlazarSiguiente(tercero);
         primero.ObtenerSiguiente().ObtenerSiguiente().enlazarSiguiente(cuarto);
         
//obtener lo que hay en el nodo 1
       System.out.println(primero.ObtenerValor().toString());
         
//obtener lo que hay en el nodo 2
       System.out.println(primero
                 .ObtenerSiguiente()
                 .ObtenerValor().toString());
         
//obtener lo que hay en el nodo 3
         System.out.println(primero
                 .ObtenerSiguiente()
                 .ObtenerSiguiente()
                 .ObtenerValor().toString());
         
//obtener lo que hay en el nodo 4
         System.out.println(primero
                 .ObtenerSiguiente()
                 .ObtenerSiguiente()
                 .ObtenerSiguiente()
                 .ObtenerValor().toString());
       
   ////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////////
   ListaEnlazada lista = new ListaEnlazada();
   
   System.out.println("la lista Esta vacia:"+ lista.EstaVacio()); //no hemos agregado algo, asi que esta vacia
   //agregamos nodos y se enlazan
   lista.addPrimero("jorge");
   lista.addPrimero("alejandro");
   lista.addPrimero("omar");
   lista.addPrimero("israel");
   lista.addPrimero(20);
   lista.addPrimero("angel");
   
   lista.eliminar(3);
   System.out.println("nuevo valor posicion que se elimino:"+ lista.Obtener(3).toString());
   
   System.out.println("Primer elemento:"+ lista.Obtener(0).toString());
   System.out.println("Ultimo elemento:"+ lista.Obtener(lista.tamano()-1).toString());
   System.out.println("Optener de la posicion:"+ lista.Obtener(3));
   
   System.out.println("la lista esta vacia:"+ lista.EstaVacio());
   System.out.println("cual es el tamaño:"+ lista.tamano());
   
   
         
    }
    
}
