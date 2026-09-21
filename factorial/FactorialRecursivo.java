/*
Nuestro pseudocódigo original fue:
public static long factorial(long n) {
    if (n = 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
 */

public class FactorialRecursivo {
    public static void main(String[] args) {
        int n = 5;

        // Se revisa que n no sea negativo.
        if (n < 0) {
            System.out.println("El factorial solo se puede calcular para numeros mayores o iguales a 0.");
        } else {
            long resultado = factorial(n);

            System.out.println("El factorial de " + n + " es: " + resultado);
        }
    }

    public static long factorial(int n) {
        // Caso base: 0! es igual a 1.
        if (n == 0) {
            return 1;
        } else {
            // Se llama nuevamente al metodo con n - 1,
            // hasta que n llegue a 0.
            return n * factorial(n - 1);
        }
    }
}

/*
Cambios en el programa:

public static long factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

> El caso base es cuando n vale 0. En ese momento el metodo devuelve 1,
  ya que por definicion 0! = 1. Sin este caso base, el metodo se llamaria
  a si mismo indefinidamente y el programa produciria un error.

> En el caso recursivo, el metodo multiplica n por el factorial de n - 1.
  Por ejemplo, si n = 5, se realiza la siguiente operacion:
  5 * factorial(4), 4 * factorial(3), 3 * factorial(2),
  2 * factorial(1) y 1 * factorial(0).

if (n < 0) {
    System.out.println("El factorial solo se puede calcular para numeros mayores o iguales a 0.");
}

> Esta condicion se agrego en el metodo main para evitar que se intente
  calcular el factorial de un numero negativo, porque el ejercicio solo
  permite valores mayores o iguales a 0.
*/