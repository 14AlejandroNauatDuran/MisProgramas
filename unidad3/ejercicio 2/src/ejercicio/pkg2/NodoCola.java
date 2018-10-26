/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

/**
 *
 * @author Admin
 */
public class NodoCola {
    Object dato;
    NodoCola siguiente;
    
    public NodoCola(Object d){
        dato = d;
        siguiente = null;
    }
}
