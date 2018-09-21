#include "NUMNATURAL.h"
#include <iostream>

using namespace std;

NUMNATURAL::NUMNATURAL()
{
    //ctor
}

int NUMNATURAL::antesdelnumero(int numero[])
{
    int num=5;
    int antes, i;

    for(i=0; i<num; i++){
        if(numero[i]>0){
            cout << "EL ANTESESOR DE " << numero[i] <<" ES "<< numero[i]-1 << endl;
        }else{
            cout << " EL NUMERO " << numero[i] << "ES 0 O MENOR "<<endl;
            cout << " NO DEVUELVO NUMEROS NEGATIVOS "<<endl;
        }
    }
}

int NUMNATURAL::despuesdelnumero(int numero[])
{
    int num=5;
    int sig,i;

    for(i=0; i<num; i++){
        if(numero[i]>0){
            cout << "EL SUCESOR DE " <<numero[i]<<" ES "<< numero[i]+1 << endl;
        }else{
            cout << " EL NUMERO " << numero[i] << "ES 0 O MENOR "<<endl;
            cout << " NO DEVUELVO NUMEROS NEGATIVOS "<<endl;
        }
    }
}

int NUMNATURAL::suma(int numero[])
{
    int suma=0;
    int num=5;
    for(int i=0; i<5; i++){
        suma += numero[i];
    }
    cout << suma;
}

int NUMNATURAL::menor(int numero[])
{
    int menor,i ;
    int num =5;

    menor=numero[0];

    for(i=0;i<num;i++)
    {
        if(numero[i]<menor)
        {
            menor=numero[i];
        }
    }
cout << menor;
}
