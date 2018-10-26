/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tam;
        Scanner x= new Scanner(System.in);
        System.out.println("tamaño de la pila");
        tam = x.nextInt();
        
        Pila2 a = new Pila2(tam);
        Cola colita = new Cola();
        System.out.println("\n\n");
        while(tam>0){
        System.out.println("introduce algo");
        Object z;
        z = x.next();
        a.push(z);
        tam--;
        }
       
        
        System.out.println("\n\nla cola tiene\n\n");
        colita.insertar(a.pop());
        
        /*System.out.println("la cola tiene2");
        int tama = colita.tamano();
        int t=1;
        System.out.println("=============");
        while(t<tama){
            System.out.println(colita.quitar());
            t++;
        }*/
        
        
        /*int t=0;
        while(t<tam){
            System.out.println(a.peek());
            colita.insertar(a.pop());
        }
       
        System.out.println("\n\nla cola tiene");
        int size = colita.tamano();
        int conta =1;
        while(conta <= size){
            colita.quitar();
            conta ++;
        }*/
        
        
        
        //System.out.println("\n\ninvertido es");
        //colita.insertar(a.pop());
       // System.out.println("\n\nla cola tiene");
        //int t = colita.tamano();
       // int n =1;
        
       // while(n <= t){
            
           // System.out.println(colita.quitar());
          //  colita.mostrar();
         //   n++;
        //}
        
    
    }
    
}
