#include "ahorcado.h"
#include <iostream>
#include <cstdlib>
#include <string>
#include <time.h>
#include <vector>
#include <string.h>
#include <fstream>
#include <stdlib.h>
#include <conio.h>

using namespace std;



ahorcado::ahorcado()
{
    //ctor
}

int cantvida;
string P_original, P_mostrar;

void ahorcado::principal(){

    iniciojuego();
    mostrarVyP();

    while(cantvida > 0 && P_mostrar != P_original){
        char l;
        cout << "\n\t";
        cin >> l;

        system("cls");
        ingresar(l);

        mostrarVyP();
    }

     if(cantvida > 0){
        cout << "\n\nAMIGO GANASTE"<<endl;
    }else{
        cout << "\n\nPERDISTE, LA PALABRA ERA: "<< P_original <<endl<< endl<< endl;
    }
P_mostrar="";
}

void ahorcado::mostrarVyP()
{


    cout << "\n\tVIDAS: "<< cantvida <<endl<< endl<< endl;
    cout << "\t" <<P_mostrar <<endl;

}

void ahorcado::ingresar(char letra)
{
    bool PerdiV = true;
    int i;

    for(i=0; i< P_original.length(); i++)
        {
        if(letra == P_original[i])
        {
            PerdiV = false;
            P_mostrar[i] = letra;
        }
    }
    if(PerdiV) cantvida--;
}

void ahorcado::iniciojuego()
{
    int i, j;
        cantvida = 6;
        P_original = O_P_aleatoria();

        for(i = 0; i < P_original.length() ; i++)
            {
            if(P_original[i] >= 'A' && P_original[i] <= 'Z')
                {
                P_original[i] += 32;
                }
            }

    for (j = 0; j < P_original.length(); j++)
        {
        if(P_original[j] >= 'a' && P_original[j] <= 'z')
            {
                P_mostrar   +=  '+';
            }
        else
            {
                P_mostrar += P_original[j];
            }
         }
}


string ahorcado::O_P_aleatoria(){
  int letras;


        vector<string>encontar;

    encontar.push_back("PARANGUATIMIRICUARO");
    encontar.push_back("JAVA SECRIP");
    encontar.push_back("PROBABILIDAD");
    encontar.push_back("LLUVIA INFINITA");
    encontar.push_back("PARAGUAS");

    srand(time(NULL)); //toman un valor aleatorio
    letras = 0 + rand()%(5);

    return encontar[letras];
}

