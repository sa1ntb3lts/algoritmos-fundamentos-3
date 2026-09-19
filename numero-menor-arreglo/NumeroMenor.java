public class NumeroMenor {
    public static void main(String[] args) {
        int[] A = {2, 5, 6, 1};

        // Se le asigna la posicion 0 para que tome en cuenta TODOS los valores
        // que hay en el arreglo. Si lo iniciaramos desde la posicion 2, la
        // comparacion no va a funcionar como se esperaria, ya que se va a 
        // comparar con los valores que le preceden sin tomar en cuenta los que
        // le anteceden, los cuales pueden ser el valor minimo en el arreglo.
        int valorMinimo = A[0];

        for(int i = 1; i < A.length; i++) {
            if (A[i] < valorMinimo) {
                valorMinimo = A[i];
            }
        }

        System.out.println("Valor minimo en el arreglo: " + valorMinimo);
    }
}