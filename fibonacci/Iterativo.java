package fibonacci;

public class Iterativo {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int sumatoria = 0;
        int n = 8;

        // Primero se suma los dos valores iniciales,
        // 'i' toma el valor de 'j', y 'j' toma el valor
        // de la suma de si mismo con 'i'. 'k' inicia
        // desde 2 para no hacer iteraciones extra.
        for(int k = 2; k <= n; k++) {
            sumatoria = i + j;
            i = j;
            j = sumatoria;
        }

        System.out.println(sumatoria);
    }
}

/*
Cambios en el programa:

long fibonacci(int n) {
    int i = 0;
    int j = 1;                      <------ Codigo original.
    int sumatoria = 0;
    for(k = 0; k <= n; k++) {
        j += i;
    }
}

> Primero anadimos la variable n, luego modificamos el valor de k para que empezara
en 2, porque si empezaba desde 0 o 1, iba a hacer iteraciones extra e iba a afectar
al total de la sumatoria. Luego cambiamos la logica dentro del for, porque con lo que 
teniamos el programa solamente daba 1 como output, o sea que no estaba avanzando.
*/