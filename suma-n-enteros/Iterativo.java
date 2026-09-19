public class Iterativo {
    public static void main(String[] args) {
        int n = 5;
        int suma = 0;

        // El valor de i va a incrementar de uno en uno hasta llegar a n,
        // y se va a ir sumando al valor de la variable 'suma'.
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println(suma);
    }
}