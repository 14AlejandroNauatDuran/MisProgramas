#ifndef AHORCADO_H
#define AHORCADO_H
#include <iostream>
#include <cstdlib>
#include <string>

using namespace std;

class ahorcado
{
    public:
        ahorcado();

        void principal();
        void mostrarVyP();
        void ingresar(char letra);
        void iniciojuego();
        string O_P_aleatoria();
    protected:

    private:
};

#endif // AHORCADO_H
