public class BinarySearch {
    // Método de búsqueda binaria recursiva
    int binarySearch(int arr[], int lo, int hi, int x) {
        if (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            // Si el elemento está en la posición media
            if (arr[mid] == x)
                return mid;
            // Si el elemento es menor, solo busca en la mitad izquierda
            if (arr[mid] > x)
                return binarySearch(arr, lo, mid - 1, x);
            // Si el elemento es mayor, solo busca en la mitad derecha
            return binarySearch(arr, mid + 1, hi, x);
        }
        return -1;        // Si no se encuentra el elemento
    }
    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1, 2, 3, 4, 5}; // Arreglo ordenado
        int n = arr.length;
        int x = 4; // Elemento a buscar
        int position = ob.binarySearch(arr, 0, n - 1, x);

        if (position == -1)
            System.out.println("elemento no encontrado !!!");
        else
            System.out.println("elemento encontrado en la posicion: " + position);
    }
}

