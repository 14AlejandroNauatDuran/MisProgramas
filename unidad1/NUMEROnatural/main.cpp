#include <iostream>
#include <stdlib.h>
#include "NUMNATURAL.h"

using namespace std;
//NAUAT DURAN ALEJANDRO DE LA CRUZ
int main()
{
    int num=5;
    int numeros[num];

    cout << "\nINGRESA NUMEROS MAYORES A 0" << endl;

    for(int i=0; i<num; i++){
        cin >> numeros[i];
        if(numeros[i]<0){
            cout << "\nEL NUMERO INGRESADODEBE SER MAYOR A 0" << endl;
            i--;
        }
    }

    system("cls");
    NUMNATURAL N;

    cout << "\n EL ANTECESOR\n"<< endl;
    N.antesdelnumero(numeros);
    cout << "\n EL SUCESOR\n"<< endl;
    N.despuesdelnumero(numeros);
    cout << "\n LA SUMA ES:\t";
    N.suma(numeros);
    cout << "\n EL MENOR ES:\t";
    N.menor(numeros);

    return 0;
}
