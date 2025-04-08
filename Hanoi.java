public class Hanoi {

    // Método recursivo para resolver el problema de las Torres de Hanói
    public static void torresHanoi(int discos, int origen, int auxiliar, int destino) {
        if (discos == 1) {
            // Caso base: mover un solo disco directamente al destino
            System.out.println("Mover disco de torre " + origen + " a torre " + destino);
        } else {
            // Mover n-1 discos de la torre origen a la torre auxiliar, usando destino como auxiliar
            torresHanoi(discos - 1, origen, destino, auxiliar);
            // Mover el disco restante directamente a la torre destino
            System.out.println("Mover disco de torre " + origen + " a torre " + destino);
            // Mover los n-1 discos de la torre auxiliar a la torre destino, usando origen como auxiliar
            torresHanoi(discos - 1, auxiliar, origen, destino);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Número de discos
        System.out.println("Solución para " + n + " discos:");
        torresHanoi(n, 1, 2, 3); // Llamada inicial con las torres 1, 2 y 3
    }
}