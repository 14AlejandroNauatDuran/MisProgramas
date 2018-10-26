/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tam;
        Scanner x= new Scanner(System.in);
        System.out.println("tamaño de la pila");
        tam = x.nextInt();
        
        Pila1 a = new Pila1(tam);
        
        while(tam>0){
        System.out.println("introduce algo");
        Object z;
        z = x.next();
        a.push(z);
        tam--;
        }
        
        System.out.println("\n\ninvertido es");
        a.pop();
        
    
    }
    
}
