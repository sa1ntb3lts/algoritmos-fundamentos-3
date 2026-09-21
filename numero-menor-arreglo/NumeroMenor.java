public class NumeroMenor {
    public static void main(String[] args) {
        // ValorMinimo empieza en 0 para tomar en
        // cuenta TODOS los valores del arreglo.
        int[] A = {1, 5, 6, 3};
        int valorMinimo = A[0];

        // Recorre el arreglo, y checa si el valor
        // en la posicion de 'i' es menor al valor que
        // contiene valorMinimo al momento de la iteracion.
        // En caso de que se cumpla, se le asigna el valor
        // de la posicion de 'i' a valorMinimo.
        for(int i = 1; i < A.length; i++) {
            if (A[i] < valorMinimo) {
                valorMinimo = A[i];
            }
        }

        System.out.println("Valor minimo en el arreglo: " + valorMinimo);
    }
}

/*
Cambios en el programa:

1.
Codigo mejorado: int[] A = {2, 5, 6, 1};
Codigo original: int[n] A = {...};

> Para lograr que el codigo se viera exactamente como lo escribimos y que a su vez funcionara, tendriamos
  que agregar Scanner y otras validaciones que extenderian demasiado el codigo, por eso optamos por esta solucion.

2.
Codigo mejorado: for(int i = 1; i < A.length; i++)
Codigo original: for(int i = 1; i < n; i++)

> Como decidimos excluir la variable n del codigo, tuvimos que optar por esta solucion la cual era la mas sencilla
  y rapida.
*/