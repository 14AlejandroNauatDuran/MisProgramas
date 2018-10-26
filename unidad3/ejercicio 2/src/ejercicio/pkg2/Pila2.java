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
public class Pila2 {
   
    Object arr[];
    int tamaño;
    int tope;
    
    public Pila2(int n){
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
    
    public Object peek(){
        if(tope>0){
        return arr[tope-1];
        }else{
            return null;
        }
    }
    public Object pop(){
        Object temp = null;
        while(tope > 0){
            temp = arr[tope-1];
            System.out.println(temp);
            arr[tope-1]=null;
            tope--;
        }
        return temp;
     }
    
}
