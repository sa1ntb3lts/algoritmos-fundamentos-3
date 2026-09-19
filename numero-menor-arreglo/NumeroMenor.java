public class NumeroMenor {
    public static void main(String[] args) {
        int[] A = {2, 5, 6, 1};
        int valorMinimo = A[0];

        for(int i = 1; i < 4; i++) {
            if (A[i] < valorMinimo) {
                valorMinimo = A[i];
            }
        }

        System.out.println("Valor minimo en el arreglo: " + valorMinimo);
    }
}