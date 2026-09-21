package fibonacci;

import java.util.Arrays;

public class RecursivoPD {
    public static void main(String[] args) {
        long[] fib = new long[9];
        // Se rellena el arreglo con valores de -1 porque
        // se va a necesitar para validaciones.
        Arrays.fill(fib, -1);

        System.out.println(fibonacci(8, fib));
    }

    // Mismo caso que el recursivo, va disminuyendo hasta
    // toparse con el caso base, solamente que usando programacion
    // dinamica, o sea que el metodo no va a llamarse a si
    // mismo.
    public static long fibonacci(int n, long fib[]) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            // Si fib[n] es diferente de -1, significa que
            // ya se hizo el calculo. Tiene que ser -1 porque
            // si fuera 0, no se va a guardar el ultimo calculo
            // cuando llegue al caso base.
            if (fib[n] != -1) {
                return fib[n];
            } else {
                fib[n] = fibonacci(n - 1, fib) + fibonacci(n - 2, fib);
            }
            return fib[n];
        }
    }
}

/*
NO PUDIMOS ENCONTRAR EL CODIGO ORIGINAL :(

> Sacamos el codigo de fibonacci con programacion dinamica
de una de las presentaciones. La implementacion que esta
dentro del main es lo unico extra que anadimos.

*/