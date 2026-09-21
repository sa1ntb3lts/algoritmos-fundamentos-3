package fibonacci;

public class Recursivo {
    public static void main(String[] args) {
        long resultado = fibonacci(8);

        System.out.println(resultado);
    }

    // Aqui esta pasando lo mismo que en cualquier
    // algoritmo recursivo, n disminuye aplicando la
    // formula de fibonacci, hasta llegar al caso base.
    public static long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

/*
Cambios en el programa:

> Lo unico que se agrego fue lo que esta dentro del metodo main.
Lo demas es lo mismo.

*/