#include <iostream>
#include "Conjuntos.h"
#include <stdlib.h>
#include<string>
using namespace std;

//mi programa conjuntos contiene arreglos de una dimensión de 10 espacios
//NAUAT DURAN ALEJANDRO DE LA CRUZ
int main()
{

    int num = 10;
    int conjuntoA[num];
    int conjuntoB[num];

    cout << "\nINGRESA 10 NUMEROS MAYORES HE IGUALES A CERO"<< endl;

    cout << "CONJUNTO A\n"<< endl;
    for(int i=0; i<num; i++){
        cin >> conjuntoA[i];
        cout << "\n";
    }
    cout << "\nCONJUNTO B\n"<< endl;
    for(int j=0; j<num; j++){
        cin >> conjuntoB[j];
        cout << "\n";
    }

    char a;
do{
    system("cls");

    Conjuntos C;


    C.lista(conjuntoA, conjuntoB);
    int op;
    cout << "\nOPERACION DE CONJUNTOS\n"<< endl;
    cout << "\n1. UNION \n"<< endl;
    cout << "2. INTERSECCIÓN \n"<< endl;
    cout << "3. DIFERNCIA SIMETRICA \n"<< endl;
    cout << "4. PERTENECE NUMERO \n"<< endl;
    cout << "5. RETIRAR NUMERO \n"<< endl;
    cout << "6. AÑADIR NUMERO \n"<< endl;
    cout << "7. CONJUNTO VACIO \n"<< endl;
    cin >> op;
    switch(op){

    case 1:
        system("cls");
            cout << "\n1. UNION \n"<< endl;
            cout << "\nLA UNION ES\n"<< endl;
            C.Union(conjuntoA, conjuntoB);
    break;
    case 2:
        system("cls");
            cout << "\n2. INTERSECCIÓN \n"<< endl;
            cout << "\nLA INTERSECCIÓN ES\n"<< endl;
            C.Interseccion(conjuntoA, conjuntoB);
    break;
    case 3:
        system("cls");
        cout << "\n3. DIFERNCIA \n"<< endl;

        C.Diferencia(conjuntoA, conjuntoB);
    break;
    case 4:
        system("cls");
        int c;
        cout << "\n4. PERTENECE NUMERO \n"<< endl;
        cout << "\n1. CONJUNTO A \n"<< endl;
        cout << "\n2. CONJUNTO B \n"<< endl;
        cin >> c;
        if(c==1){
            int a;
            cout << "\nNUMERO QUE QUIERE BUCAR \n"<< endl;
            cin >> a;
            C.Setnumero(a);
            C.PerteneceAlConjunto(conjuntoA);
        }else{
            int b;
            cout << "\nNUMERO QUE QUIERE BUCAR \n"<< endl;
            cin >> b;
            C.Setnumero(b);
            C.PerteneceAlConjunto(conjuntoB);
        }
    break;
    case 5:
        system("cls");

        cout << "\n5. RETIRAR NUMERO \n"<< endl;
        cout << "\n1. CONJUNTO A \n"<< endl;
        cout << "\n2. CONJUNTO B \n"<< endl;
        cin >> c;
        if(c==1){
            int a;
            cout << "\nINTRODUZCA EL NUMERO A RETIRAR \n"<< endl;
            cin >> a;
            C.Setnumero(a);
            C.RetirarElemento(conjuntoA);
        }else{
            int x;
            cout << "\nINTRODUZCA EL NUMERO A RETIRAR \n"<< endl;
            cin >> x;
            C.Setnumero(x);
            C.RetirarElemento(conjuntoB);
            }
            break;
    case 6:
        system("cls");

        cout << "\n6. AÑADIR NUMERO \n"<< endl;
        cout << "\n1. CONJUNTO A \n"<< endl;
        cout << "\n2. CONJUNTO B \n"<< endl;
        cin >> c;
        if(c==1){
            int a,z;
            cout << "\nINTRODUZCA EL NUMERO A ANADIR \n"<< endl;
            cin >> a;
            C.Setnumero(a);
            cout << "\nINTRODUZCA LA POSICIÓN EN LA QUE LO DESEA \n"<< endl;
            cin >> z;
            C.Setpos(z);
            C.AnadirElemento(conjuntoA);
        }else{
            int a,z;
            cout << "\nINTRODUZCA EL NUMERO A ANADIR \n"<< endl;
            cin >> a;
            C.Setnumero(a);
            cout << "\nINTRODUZCA LA POSICIÓN EN LA QUE LO DESEA \n"<< endl;
            cin >> z;
            C.Setpos(z);
            C.AnadirElemento(conjuntoB);
            }
            break;
    case 7:
        system("cls");

        cout << "\n7. CONJUNTO VACIO \n"<< endl;
        C.ConjuntoVacio();
        break;
    }
cout << "\n\n DESEA SEGUIR (S/N)"<< endl;
cin>> a;
}while(a=='S'||a=='s');

return 0;
}
