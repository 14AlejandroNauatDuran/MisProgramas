/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

/**
 *
 * @author Admin
 */
public class Cola {
    NodoCola inicio, ultimo;
    int tama;
    
    public Cola(){
        
        inicio=ultimo=null;
        tama=0;
    }
    public boolean vacio(){
        return inicio == null;
    }
    public void insertar(Object x){
        NodoCola valor = new NodoCola(x);
        
        
        
        if(vacio()){
            inicio = valor;
            
        }else{
            ultimo.siguiente = valor;
            
        }
        ultimo = valor;
        tama++;
    }
   /* public Object quitar(){
        
        Object aux = null;
         if(tama > 0){
            aux=inicio.dato;
            //System.out.println(aux);
            inicio=inicio.siguiente;
            tama--; 
         }
        return aux;
    }*/
    
    public int tamano(){
        return tama;
    }
  
    /*public void mostrar(){
        reco = inicio;
        System.out.println("cola");
        while(reco!=null){
            System.out.println(reco.dato+"-");
            reco = reco.siguiente;
        }
        System.out.println();
    }*/
      
    
}
