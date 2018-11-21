/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.*;

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
        //Perez Uc Pablo Ernesto
        //Nauat Duran Alejandro de la Cruz
        Scanner entrada = new Scanner(System.in);
        
        Queue<Object> cola1 = new LinkedList<>();
        Stack<Integer> pila1 = new Stack<>();
        
        int op;
        int niños, regalos, r=0, n=0;
        Object N=null;
        int R=0;
        do{
            System.out.println("1 llenar pila");
            System.out.println("2 llenar cola");
            System.out.println("3 Imprimir");
            System.out.println("0 terminar");
            op = entrada.nextInt();
            
            switch(op){
                case 1:
                        System.out.println("tamanio de pila");
               
                        regalos = entrada.nextInt();
                        r=regalos;
                        int i=1;
                        while(i<=regalos){
                            System.out.println("ingresar regalos");
                            pila1.push(entrada.nextInt());
                            i++;
                        }//while
                    break;
                    
                case 2:
                    System.out.println("tamanio de cola");
               
                        niños = entrada.nextInt();
                        n=niños;
                        int j=1;
                        while(j<=niños){
                            System.out.println("ingresar niños");
                            cola1.add(entrada.next());
                            j++;
                        }//while
                    break;
                    
                case 3:
                    if(n == r){
                        int k=1;
                        while(k<=n){
                            N=cola1.remove();
                            R=pila1.pop();
                            System.out.println("("+N+" , "+R+")");
                            k++;
                            }
                    }
                    
                
            }//switch  
        }while(op!=0);
    }//main
}//class
