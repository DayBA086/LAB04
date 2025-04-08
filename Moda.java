public class Moda {

    // Función que devuelve la frecuencia de un valor en el arreglo entre dos índices
    public static int frecuencia(int[] array, int inicio, int fin, int valor) {
        int count = 0;
        for (int i = inicio; i <= fin; i++) {
            if (array[i] == valor)
                count++;
        }
        return count;
    }

    // Función principal para encontrar la moda
    public static int modal(int array[]) {
        int first = 0;
        int end = array.length - 1;

        if (first == end)
            return array[first];

        int moda = array[first];
        int maxfrec = frecuencia(array, first, end, moda);

        for (int i = first + 1; i <= end; i++) {
            int frec = frecuencia(array, i, end, array[i]);
            if (frec > maxfrec) {
                maxfrec = frec;
                moda = array[i];
            }
        }

        return moda;
    }

    public static void main(String[] args) {
        int[] ejemplo = {2, 4, 5, 2, 3, 2, 4, 5};
        System.out.println("La moda es: " + modal(ejemplo));
    }
}
