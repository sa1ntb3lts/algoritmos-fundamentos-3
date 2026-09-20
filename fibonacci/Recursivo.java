package fibonacci;

public class Recursivo {
    public static void main(String[] args) {
        long resultado = fibonnaci(8);

        System.out.println(resultado);
    }

    public static long fibonnaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonnaci(n - 1) + fibonnaci(n - 2);
        }
    }
}

/*
Cambios en el programa:

> Lo unico que se agrego fue lo que esta dentro del metodo main.
Lo demas es lo mismo.

*/