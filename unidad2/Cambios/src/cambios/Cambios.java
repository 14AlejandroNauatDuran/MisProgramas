/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambios;
import java.util.Scanner;
//import static cambios.cambio.calcular;
//import static cambios.NewCambio.cambio;
/**
 *
 * @author Admin
 */
//Nauat Duran Alejandro de la Cruz
public class Cambios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precio,pago,cambio;
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el precio del articulo\n");
        precio= lector.nextInt();
        System.out.println("\ningrese el pago2 del articulo\n");
        pago= lector.nextInt();
        
        cambio=pago-precio;
        
        if(cambio==0){
            System.out.println("\nSe ha pagado exacto\n");
        }else if(cambio>0){
            System.out.println("\ntotal de cambio es:"+ cambio+"\n");
            System.out.println("\nse le entrega:\n");
            //calcular(cambio);
            NewCambio nuevo = new NewCambio();
            nuevo.cambio(cambio);
            
        }
                
        
    }
    
}
