/* Nuestro pseudocódigo original fue el siguiente:

public static long factorialIte(long n) {
    long factor = 1;

    for (long i = 1; i <= n; i++) {
        factor = factor * i;
        return factor;

        if (factor > 1) {
            factor = factor(i);
            return factor;
        } else {
            break;
        }
    }
}
*/

public class FactorialIterativo {
    public static void main(String[] args) {
        int n = 5;
        long factorial = 1;

        // Se verifica que el numero sea mayor o igual a 0,
        // ya que el factorial de un numero negativo no existe.
        if (n < 0) {
            System.out.println("El factorial solo se puede calcular para numeros mayores o iguales a 0.");
        } else {

            // La variable i aumenta de uno en uno desde 1 hasta n.
            // En cada vuelta se multiplica el valor actual de factorial por i.
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + n + " es: " + factorial);
        }
    }
}

/*
Cambios en el programa:

long factorial = 1;

> La variable factorial debe iniciar en 1, porque 1 es el elemento
  neutro de la multiplicacion. Si iniciara en 0, cualquier numero
  multiplicado por 0 daria como resultado 0.

for (int i = 1; i <= n; i++) {
    factorial *= i;
}

> El ciclo comienza en 1 y aumenta hasta llegar a n. En cada iteracion,
  el valor de i se multiplica por factorial. Por ejemplo, si n = 5:
  factorial = 1 * 1 * 2 * 3 * 4 * 5, por lo que el resultado es 120.

if (n < 0) {
    System.out.println("El factorial solo se puede calcular para numeros mayores o iguales a 0.");
}

> Se agrego esta condicion para evitar calcular el factorial de numeros
  negativos, ya que el ejercicio indica que n debe ser igual o mayor a 0.

> El caso n = 0 funciona correctamente porque el ciclo no se ejecuta y
  factorial conserva su valor inicial de 1. Esto coincide con que 0! = 1.
*/