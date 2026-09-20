package fibonacci;

public class Iterativo {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int sumatoria = 0;
        int n = 8;

        // La variable 'k' empieza en 2 para que no haga iteraciones extra.
        for(int k = 2; k <= n; k++) {
            sumatoria = i + j;
            i = j;
            j = sumatoria;
        }

        System.out.println(sumatoria);
    }
}