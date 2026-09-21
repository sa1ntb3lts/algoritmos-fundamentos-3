public class Recursivo {
    public static void main(String[] args) {
        long resultado = algoritmo(5);
        
        System.out.println(resultado);
    }

    // Lo que se hace aqui es basicamente, que el
    // input que nosotros le dimos va a ir disminuyendo
    // hasta llegar al caso base, siendo 0 en este caso.
    public static long algoritmo(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + algoritmo(n - 1);
        }
    }
}

/*
Cambios en el programa:

algoritmo() {
    int n;
    int i = 1;
    i++;                <------ Codigo original.
    int suma += i;
    if (n != 0) {
        algoritmo();
    }
    n -= 1;
}

> Tuvimos que cambiar todo el codigo. El problema del original es que para empezar,
cuando se llegua a la linea numero 26 (la que llama al metodo) el programa entra
en un bucle infinito. El segundo problema es que, aunque el programa ejecutara
correctamente, no iba a funcionar porque el valor de las variables se iba a estar
reiniciando en cada iteracion.

*/