public class Recursivo {
    public static void main(String[] args) {
        long resultado = algoritmo(1);
        
        System.out.println(resultado);
    }

    public static long algoritmo(long n) {
        if (n == 0) {
            return 0;
        } else {
            return n + algoritmo(n - 1);
        }
    }
}