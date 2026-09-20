public class NumeroMenor {
    public static void main(String[] args) {
        int[] A = {2, 5, 6, 1};
        int valorMinimo = A[0];

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