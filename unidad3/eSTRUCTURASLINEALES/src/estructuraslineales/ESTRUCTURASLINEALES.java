/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraslineales;
import java.util.LinkedList; //lista almacenadora de nodos para colas
import java.util.Stack; //utilizado para las pilas
import java.util.Queue; //utilizado para el flujo de datos en colas
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class ESTRUCTURASLINEALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int op, subop;
        
        Queue<Integer> cola = new LinkedList<>();
        Stack<Integer> pila = new Stack<>();
        
        do{
            System.out.println("1. PILAS");
            System.out.println("2. COLAS");
            System.out.println("0. SALIR");
            System.out.println("INGRESA OPCION");
            op = entrada.nextInt();
            
            if(op>=0 && op<=2){
                do{
                    System.out.println("1 agregar");
                    System.out.println("2 quitar");
                    System.out.println("3 mostrar");
                    System.out.println("0 regresar");
                    System.out.println("ingresar opcion");
                    subop = entrada.nextInt();
                    
                    int datoSalida; //almacena dato elimidado
                    
                    switch(subop){
                        case 1: //agregar elemento
                            System.out.println("INTRODUCE ELEMENTO");
                            if(op == 1){
                                pila.push(entrada.nextInt());
                            }else{
                                cola.add(entrada.nextInt());
                            }
                            break;
                        case 2://Eliminar elemento
                            if(op == 1){
                                datoSalida = pila.pop();
                            }else{
                                datoSalida = cola.remove();
                            }
                            System.out.println("SE ELIMINO EL DATO "+ datoSalida);
                            break;
                        case 3:
                            if(op == 1){
                                System.out.println(pila);
                            }else{
                                System.out.println(cola);
                            }
                        default:
                            System.out.println("no valido");
                    }
                    
                    
                }while(subop != 0);
            }else{
                System.out.println("opcion no valido");
            }
        }while(op!=0);
    }
    
}
