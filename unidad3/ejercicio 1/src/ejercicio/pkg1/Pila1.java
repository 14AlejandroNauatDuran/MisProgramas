/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;
import java.io.*;

/**
 *
 * @author Admin
 */
public class Pila1 {
    
    Object arr[];
    int tamaño;
    int tope;
    
    public Pila1(int n){
        tamaño = n;
        arr = new Object[tamaño];
        tope = 0;
        
    }
    public void push(Object x){
        if(tope < tamaño){
        arr[tope]=x;
        tope++;
        }
    }
    public void pop(){
        Object temp;
        while(tope > 0){
            temp = arr[tope-1];
            System.out.println(temp);
            arr[tope-1]=null;
            tope--;
        }
     
        
    }
}
