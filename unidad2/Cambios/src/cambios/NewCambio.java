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
//forma recursiva
//Nauat Duran Alejandro de la Cruz
public class NewCambio {
    int quinientos=0, doscientos=0, cien=0, cincuenta=0, veinte=0, diez=0, cinco=0, dos=0, uno=0;
    int cambio(int monto){
        
        
        while(monto>0){
            if(monto>=500){
                quinientos=monto/500;
                return cambio(monto-quinientos*500);
            }
            if(monto>=200 && monto<500){
                doscientos=monto/200;
                return cambio(monto-doscientos*200);
            }
            if(monto>=100 && monto<200){
                cien=monto/100;
                return cambio(monto-cien*100);
            }
            if(monto>=50 && monto<100){
                cincuenta=monto/50;
                return cambio(monto-cincuenta*50);
            }
            if(monto>=20 && monto<50){
                veinte=monto/20;
                return cambio(monto-veinte*20);
            }
            if(monto>=10 && monto<20){
                diez=monto/10;
                return cambio(monto-diez*10);
            }
            if(monto>=5 && monto<10){
                cinco=monto/5;
                return cambio(monto-cinco*5);
            }
            if(monto>=2 && monto<5){
                dos=monto/2;
                return cambio(monto-dos*2);
            }
            if(monto>=1 && monto<2){
                uno=monto/1;
                return cambio(monto-uno*1);
            }
        }
        
        if(quinientos>0){
            System.out.println(+quinientos+" billetes de 500");
        }
        if(doscientos>0){
            System.out.println(+doscientos+" billetes de 200");
        }
        if(cien>0){
            System.out.println(+cien+" billetes de 100");
        }
        if(cincuenta>0){
            System.out.println(+cincuenta+" billetes de 50");
        }
        if(veinte>0){
            System.out.println(+veinte+" billetes de 20");
        }
        if(diez>0){
            System.out.println(+diez+" monedas de 10");
        }
        if(cinco>0){
            System.out.println(+cinco+" monedas de 5");
        }
        if(dos>0){
            System.out.println(+dos+" monedas de 2");
        }
        if(uno>0){
            System.out.println(+uno+" monedas de 1");
        }
        
        return 0;
    }
    
}
