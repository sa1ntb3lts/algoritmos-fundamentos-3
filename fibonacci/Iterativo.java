package fibonacci;

public class Iterativo {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int sumatoria = 0;
        int n = 8;

        // La variable 'k' empieza en 1 para que no haga una iteracion
        // extra.
        for(int k = 1; k <= n; k++) {
            sumatoria = i + j;
            i = j;
            j = sumatoria;
        }

        System.out.println(sumatoria);
    }
}