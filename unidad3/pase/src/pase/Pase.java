/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pase;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Pase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        Queue<Integer> cola = new LinkedList<>();
        Stack<Integer> pila = new Stack<>();
        
        int op;
        //int datoSalida =0;
        int x;
        do{
        System.out.println("1 agregar");
        //System.out.println("2 quitar");
        System.out.println("3 mostrar pila y cola");
        //System.out.println("4. mostrar cola");
        System.out.println("0 terminar");
        
        System.out.println("ingresar opcion");
        op = entrada.nextInt();
        
        
        //if( datoSalida %2 == 0){
          //  cola.add(datoSalida);
            //}
        
        
        switch(op){
            case 1:
                
                System.out.println("ingresa");
                x=entrada.nextInt();
                pila.push(x);
                if( x %2 == 0){
            cola.add(x);
            }
                break;
            //case 2:
                
                //x = pila.pop();
                //System.out.println("salio "+x);
              //  break;
            case 3:
                System.out.println("la pila es");
                System.out.println(pila);
                System.out.println("la cola es ");
                System.out.println(cola);
                break;
            //case 4:
              //  System.out.println("la cola es ");
                //System.out.println(cola);
             default:
                System.out.println("no valido");
        }
        
    }while(op!=0);
    }
    
}
