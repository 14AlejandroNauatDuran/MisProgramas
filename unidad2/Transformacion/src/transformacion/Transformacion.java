/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformacion;
import java.util.Scanner;
import static transformacion.binario.calculo;
/**
 *
 * @author Admin
 */
//Nauat Duran Alejandro de la Cruz
public class Transformacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        do{
        int bi;
        Scanner s =  new Scanner(System.in );
        System.out.println("introduzca cualquier numero decimal\n");
        bi= s.nextInt();
        System.out.println("\nnumero binario es:\n");
        System.out.println(calculo(bi));
        
        System.out.print("\n1.continuar\n");
        System.out.print( "2. salir\n");
        n=s.nextInt();
        
        }while(n!=2);
    }
    
}
