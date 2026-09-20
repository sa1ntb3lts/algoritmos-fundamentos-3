package fibonacci;

import java.util.Arrays;

public class RecursivoPD {
    public static void main(String[] args) {
        long[] fib = new long[9];
        Arrays.fill(fib, -1);

        System.out.println(fibonacci(8, fib));
    }

    public static long fibonacci(int n, long fib[]) {
        if (n == 0 || n == 1) {
            return n;
        } else {
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