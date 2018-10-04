/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;
import java.util.Scanner;
import static palindromo.buscador.buscador;
//import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
//Nauat Duran Alejandro de la Cruz
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        do{
            
        System.out.print("Bienvenido a palindromo\n");
        Scanner x=new Scanner (System.in);
        String palabra, cambiar;
        System.out.print("cual es tu palabra\n");
        palabra= x.nextLine();
        
        cambiar=palabra.replaceAll(" ","");
        System.out.print("La palabra añadida "+palabra+": ");
        if (buscador(cambiar))
            System.out.println("\nSi es palindromo amigo");
        else
            System.out.println("\nLo lamento, pero no es palindromo");
        
        System.out.print("\n1.continuar\n");
        System.out.print( "2. salir\n");
        n=x.nextInt();
        
        }while(n!=2);
    }
    
}
