/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Admin
 */
public class ListaEnlazada {
    Nodo cabeza;//nodo principal de la lista
    int size;
    Object v="";
    public ListaEnlazada(){
        cabeza = null; //hace referencia a que no hay nada en la lista, ya que no hemos ingresado nada
        size = 0; //el tamaño se ejemplifica como un contador
        
    }
    
    public boolean EstaVacio(){
        return(cabeza == null)?true:false;//preguntamos
        //la cabeza esta vacia, si....verdadero/falso        
    }
    
    public void addPrimero(Object anadido){
        //v=cabeza;
            //Nodo nuevo = new Nodo(v);
         
        if(cabeza == null){ // si no tengo nada en mi nodo
            //cabeza = nuevo;
            cabeza = new Nodo(anadido); //el valo que yo ingrese, sera mi primera cabeza
        }else{ //en caso contario
            
            Nodo temporal = cabeza; //aislo lo que tego en cabeza o mi primer nodo
            Nodo nuevo = new Nodo(anadido); //creo un nuevo nodo con el valor añadido
            nuevo.enlazarSiguiente(temporal); //y lo enlazo con el que anteriormente fue mi cabeza
            cabeza = nuevo; // ahora mi cabeza es mi nuevo valor
            // con esto se cumple la propiedad de las listas
            // como ya empiezo a añadir, se crea el metodo del tamaño
            
        }
        size++; //es mi contado de tamaño, que originalmente esta en 0, crece en uno
    }
    
    public int tamano(){
        return size; // solo se va a retornal el valor numerico de cuantos nodos ya hay creados en la lista
    }
    
    public Object Obtener(int posicion){
        int contador = 0; //con el contador nos servira para seguir o finalizar en el ciclo
        Nodo resguardo = cabeza; //lo que hace es aislar lo que hay en el primer nodo
        
        while(contador < posicion){
            resguardo = resguardo.ObtenerSiguiente();
            contador ++;
        }
        return resguardo.ObtenerValor();
    }
    
    public void eliminar(int posicion){
        if(posicion == 0){
            cabeza = cabeza.ObtenerSiguiente();//la cabeza sera la siguiente posición, para eliminar la primera posicion
        }else{
            int contador = 0; //con el contador nos servira para seguir o finalizar en el ciclo
            Nodo resguardo = cabeza; //lo que hace es aislar lo que hay en el primer nodo
        
            while(contador < posicion - 1){
                resguardo = resguardo.ObtenerSiguiente();
                contador ++;
            }
            resguardo.enlazarSiguiente(resguardo.ObtenerSiguiente().ObtenerSiguiente());
        }
        size--;
    }
    
   /* public void imprimir(){
        if(cabeza==null){
            System.out.println("la lista sigue vacia");
        }else{
            Nodo temporal = new Nodo();
            temporal = cabeza;
            while(temporal != null){
                System.out.println(temporal);
                temporal=temporal.ObtenerSiguiente();
                
            }
        }
    }*/
}
