/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Proyecto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arbol = new Arbol(); //llamada del objeto
        Scanner entrada= new Scanner(System.in);//escaneo
        int cant_ele, inde, op, bu;//solo para valores enteros
        Object va;//para los datos que se guardan dentro del nodo
        
        System.out.println("cuantos elemtos desea ingresar");//para el for y creear los nodos que se deseen
        cant_ele = entrada.nextInt();
        //for de llenado de nodos
        //el primer nodo creado siempre sera la raiz, sienpre y cuando sea vacio
        for(int i=0; i < cant_ele; i++){
            System.out.println("ingresa indice");
            inde = entrada.nextInt();
            System.out.println("ingreza contenido");
            va = entrada.next();
            //metodo de creación de nodo
            arbol.inserar(inde,va);
        }
        //menu
        System.out.println("1 impresion del arbol");
        System.out.println("2 numeros mayores a la raiz");
        System.out.println("3 nodos hoja");
        System.out.println("4 recorrido hoja a raiz");
        System.out.println("5 buscador");
        op= entrada.nextInt();
        
        switch(op){
            case 1:
                //impresión de arbol de busqueda
                System.out.println("impresion del arbol");
                arbol.recorrer(arbol.raiz);
                break;
            case 2:
                //elementos mayores, como se encuentra en el lado derecho, es lo que intento realizar
                arbol.valoresMay();
                break;
            case 3:
                //impresión para todos los nodos hoja
                break;
            case 4:
                //recorrido de una hoja hasta la raiz, impresión de todos los nodos del camino
                break;
            case 5:
                //busqueda de un nodo, con respecto a su numero de llave del nodo
                System.out.println("ingresa numero del indice");
                bu=entrada.nextInt();
                System.out.println(arbol.buscar(bu));
                break;
                    }
        
    }
    
}
