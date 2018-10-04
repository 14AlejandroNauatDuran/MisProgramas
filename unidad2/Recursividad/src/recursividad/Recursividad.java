
package recursividad;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
//Nauat Duran Alejandro de la Cruz
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println("introduce el numero");
        Scanner a = new Scanner(System.in);
        n = a.nextInt();
        Recursivo nuevo = new Recursivo();
           System.out.println("factorial de " +n);
           System.out.println(nuevo.factorial(n));
           System.out.println("serie fibonacci posicion "+n);
           System.out.println(nuevo.fibo(n));
        
    }
    
}
