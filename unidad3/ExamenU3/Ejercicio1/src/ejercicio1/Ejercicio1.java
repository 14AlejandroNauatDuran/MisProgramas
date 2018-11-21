/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.*; //utilizo Stack y Scanner

/**
 *
 * @author Admin
 */
public class Ejercicio1 {
    //Perez Uc Pablo Ernesto
    //Nauat Duran Alejandro de la Cruz

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        
        Scanner entrada = new Scanner(System.in);
        int op;
        int x = 0;
        int y = 0;
        int vueltas;
        int z=0;
        do{
        System.out.println("1.- Ingresar numeros");
        System.out.println("2.- Mostrar pila salida");
        System.out.println("0.- Finalizar");
        op = entrada.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Ingresar pares");
               
                vueltas = entrada.nextInt();
                z=vueltas;
                int i=1;
                while(i<=vueltas){
                    System.out.println("ingresa i");
                    pila1.push(entrada.nextInt());
                    System.out.println("ingresa j");
                    pila1.push(entrada.nextInt());
                    i++;
                }
                break;
             case 2:
                 int j=1;
                 while(j<=z){
                 y= pila1.pop();
                 x= pila1.pop();
                 
                 if((y-1) == x){
                     pila2.push(x);
                     pila2.push(y);
                 }
                 j++;
                 }
                 System.out.println(pila2+",");
                break;
                 
            }
        }while(op!=0);  
    }
    
}
