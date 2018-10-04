/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambios;

/**
 *
 * @author Admin
 */
//Nauat Duran Alejandro de la Cruz
public class cambio {
    //public void cambiar(int cambio){
      //  int quinientos=0, doscientos=0, cien=0, cincuenta=0;
    //}
        public static void calcular(double totalCambio)
    {
        // Indicamos todas las monedas posibles
        double [] valor={500, 200, 100, 50, 20, 10, 5, 2, 1};
 
        // Creamos un array con 0 de longitud igual a la cantidad de monedas
        // Este array contendra los valores a cantidad
        double [] cantidad={0,0,0,0,0,0,0,0,0};
 
        // Recorremos todas las monedas
        for(int i=0;i<valor.length;i++)
        {
            // Si el importe actual, es superior a la moneda
            if(totalCambio>=valor[i])
            {
                // obtenemos cantidad de monedas
                cantidad[i]=Math.floor(totalCambio/valor[i]);
 
                // actualizamos el valor del importe que nos queda por didivir
                totalCambio=totalCambio-(cantidad[i]*valor[i]);
            }
        }
 
        // mostrar el resultado
        for(int i=0;i<valor.length;i++)
        {
            if(cantidad[i]>0)//indica que hay que continuar, si lo que resta de cambio es mayor a cero
            {
                if(valor[i]>10)//indica que los datos mayores de 10 se cosidera billete
                {
                    // Indicamos billetes
                    System.out.println("Hay "+cantidad[i]+" billetes de: "+valor[i]+" pesos");
                }else{
                    // Indicamos monedas
                    System.out.println("Hay "+cantidad[i]+" monedas de: "+valor[i]+" pesos");
                }
            }
        }
    }
 
}


