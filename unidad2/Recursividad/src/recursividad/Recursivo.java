/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Admin
 */
//Nauat Duran Alejandro de la Cruz
public class Recursivo {
    long factorial(long n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    
    long fibo(long n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
