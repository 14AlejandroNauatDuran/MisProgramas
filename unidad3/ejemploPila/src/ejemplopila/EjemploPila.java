/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopila;

/**
 *
 * @author Admin
 */
public class EjemploPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Pila{
    int arreglo[],n,tope;
    
    public Pila(int tamanio){
        n=tamanio;
        arreglo = new int[n];
        tope = -1;
    }
    
    public void insertar(int valor){
        if(tope<n)System.out.println("lleno");
        else{
            tope++;
            arreglo[tope] = valor;
        }
    }
    
    public int pop(){
        int aux;
        if
    }
}//fin de la clase
