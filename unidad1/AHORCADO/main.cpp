#include <iostream>
#include "ahorcado.h"


using namespace std;
//NAUAT DURAN ALEJANDRO DE LA CRUZ
int main()
{
    ahorcado A;
    char a;
do{
        system("cls");
         cout << "\n\tBIENVENIDO, INICIEMOS" << endl<< endl<< endl<< endl;
        A.principal();
        cout<<"s/N"<<endl;
        cin >> a;
}while(a=='s'||a=='S');
return 0;

}
