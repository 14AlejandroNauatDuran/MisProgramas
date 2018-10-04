/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author Admin
 */
//Nauat Duran Alejandro de la Cruz
public class buscador {
    public static boolean buscador(String palabra)
    {
        if(palabra.length()==0 || palabra.length()==1)
            return true;
        
        if(palabra.charAt(0)==palabra.charAt(palabra.length()-1))
        return buscador(palabra.substring(1, palabra.length()-1));
        return false;
        
    }
    
}
