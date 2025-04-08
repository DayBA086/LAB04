public class BinarySearchIterativo {
    // Método de búsqueda binaria iterativa
    int binarySearch(int arr[], int x) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;  // Calculamos el índice medio
            // Si el elemento está en el medio
            if (arr[mid] == x)
                return mid;
            // Si el elemento es mayor, buscar en la mitad derecha
            if (arr[mid] < x)
                lo = mid + 1;
            else
                // Si el elemento es menor, buscar en la mitad izquierda
                hi = mid - 1;
        }
        return -1; // No encontrado
    }
    public static void main(String[] args) {
        BinarySearchIterativo ob = new BinarySearchIterativo();
        int arr[] = {1, 2, 3, 4, 5}; // Arreglo ordenado
        int x = 3; // Elemento a buscar
        int position = ob.binarySearch(arr, x);
        if (position == -1)
            System.out.println("elemento no encontrado");
        else
            System.out.println("elemento encontrado en la posicion: " + position);
    }
}
