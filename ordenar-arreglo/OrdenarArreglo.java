import java.util.Arrays;

public class OrdenarArreglo {
    public static void main(String[] args) {
        int[] A = {2, 1, 5, 0};
        int aux = 0;

        System.out.println("Arreglo antes del ordenamiento: ");
        System.out.println(Arrays.toString(A));

        for(int i = 0; i <= A.length - 2; i++) {
            for(int j = 0; j <= A.length - 2 - i; j++) { 
                if (A[j] > A[j + 1]) {
                    aux = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = aux;
                }
            }
        }

        System.out.println("Arreglo despues del ordenamiento: ");
        System.out.println(Arrays.toString(A));
    }
}