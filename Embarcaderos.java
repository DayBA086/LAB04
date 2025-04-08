public class Embarcaderos {

    public static int[][] calcularCostesMinimos(int[][] T) {
        int n = T.length;
        int[][] C = new int[n][n];

        // Inicializamos C con los valores directos de T
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                C[i][j] = T[i][j];
            }
        }

        // Aplicamos programación dinámica
        for (int longitud = 2; longitud < n; longitud++) {
            for (int i = 0; i + longitud < n; i++) {
                int j = i + longitud;
                for (int k = i + 1; k < j; k++) {
                    C[i][j] = Math.min(C[i][j], T[i][k] + C[k][j]);
                }
            }
        }

        return C;
    }

    public static void main(String[] args) {
        // Matriz de tarifas T (triangular superior)
        int[][] T = {
            {0, 3, 1, 6, 999},  // desde embarcadero 0
            {0, 0, 1, 999, 4},  // desde embarcadero 1
            {0, 0, 0, 1, 2},    // desde embarcadero 2
            {0, 0, 0, 0, 1},    // desde embarcadero 3
            {0, 0, 0, 0, 0}     // desde embarcadero 4
        };

        int[][] C = calcularCostesMinimos(T);

        System.out.println("Matriz de costes mínimos C:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print((C[i][j] == 999 ? "∞" : C[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
