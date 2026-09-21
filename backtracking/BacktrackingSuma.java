import java.util.ArrayList;

public class BacktrackingSuma {
    public static void main(String[] args) {
        int[] A = {13, 11, 7};
        int K = 20;

        ArrayList<Integer> subconjunto = new ArrayList<Integer>();

        System.out.println("Arreglo: {13, 11, 7}");
        System.out.println("Suma buscada: " + K);
        System.out.println("Subconjuntos encontrados:");

        buscarSubconjuntos(A, K, 0, 0, subconjunto);
    }

    public static void buscarSubconjuntos(int[] A, int K, int posicion,
                                          int suma, ArrayList<Integer> subconjunto) {

        // Si la suma actual es igual a K, se encontro una solucion.
        if (suma == K) {
            System.out.println(subconjunto);
            return;
        }

        // Si ya se revisaron todos los elementos o la suma supera K,
        // se termina esta posibilidad y se regresa al paso anterior.
        if (posicion == A.length || suma > K) {
            return;
        }

        // Se agrega el elemento actual al subconjunto.
        subconjunto.add(A[posicion]);

        // Se busca una solucion incluyendo el elemento actual.
        buscarSubconjuntos(A, K, posicion + 1,
                suma + A[posicion], subconjunto);

        // Se elimina el ultimo elemento agregado.
        // Esto representa el retroceso o backtracking.
        subconjunto.remove(subconjunto.size() - 1);

        // Se busca una solucion sin incluir el elemento actual.
        buscarSubconjuntos(A, K, posicion + 1, suma, subconjunto);
    }
}

/*
El programa busca subconjuntos cuya suma sea exactamente igual a K.

En este ejemplo:

A = {13, 11, 7}
K = 20

El programa prueba dos opciones por cada elemento:

1. Incluir el elemento en el subconjunto.
2. No incluir el elemento en el subconjunto.

Por ejemplo, inicia agregando 13. Despues puede intentar agregar 11,
pero 13 + 11 = 24, que es mayor que 20. Entonces se elimina 11 y se
prueba con 7. Como 13 + 7 = 20, se imprime el subconjunto [13, 7].

La instruccion:

subconjunto.remove(subconjunto.size() - 1);

es la que realiza el backtracking, porque elimina el ultimo numero que
se habia agregado para regresar a una solucion anterior y probar otra
posibilidad.

Salida esperada:

Arreglo: {13, 11, 7}
Suma buscada: 20
Subconjuntos encontrados:
[13, 7]
*/