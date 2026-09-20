package fibonacci;

public class Iterativo {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int sumatoria = 0;
        int n = 8;

        // La variable 'k' empieza en 2 para que no haga iteraciones extra.
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

> Primero anadimos la variable n, luego modificamos el valor de k (por la razon que se menciona
en el comentario), y cambiamos la logica dentro del for, porque con lo que teniamos el programa
solamente daba 1 como output, o sea que no estaba avanzando.
*/