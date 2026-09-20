package fibonacci;

public class Iterativo {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int sumatoria = 0;
        int n = 8;

        for(int k = 1; k <= n; k++) {
            sumatoria += i;
            i = j;
            j = sumatoria;
        }

        System.out.println(sumatoria);
    }
}