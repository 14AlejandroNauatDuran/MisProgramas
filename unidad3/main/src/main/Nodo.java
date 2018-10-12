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
public class Nodo {
    
    Object valor; //crear un objeto para guardar cualquien valor
    Nodo siguiente; //de esta manera creamos lo que se consideraria un puntero
    
    public Nodo(Object valor){ //se crea el constructor con el valor de tendra el nodo
            this.valor = valor; //el valor que se ingrese a meodo desde el main se almacena en object valor
        this.siguiente = null; //si no hay algo devolver 0
    }
    public Object ObtenerValor(){
        return valor; //obtenemos el valo que hay en el nodo
    }
    
    public void enlazarSiguiente(Nodo n){
        siguiente = n; //nos sirve para enlazar o apuntar hacia el siguiente nodo
    }
    
    public Nodo ObtenerSiguiente(){
        return siguiente;//nos sirve para pasar de nodo a nodo y obtener lo
                            //el vaorque hay en el nodo
    }
}
