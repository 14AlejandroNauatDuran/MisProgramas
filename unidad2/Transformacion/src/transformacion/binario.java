/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformacion;

/**
 *
 * @author Admin
 */
//Nauat Duran Alejandro de la Cruz
public class binario {
    public static int calculo(int bi){
        
        if(bi==0){
            return 0;   
        }else{
            return (bi %2 + 10 * calculo(bi/2));
        }
    }
}
