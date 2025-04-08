import java.util.Random;

public class QuickSelect {

    static Random rand = new Random();

    public static int quickSelect(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    private static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) return arr[left];

        int pivotIndex = partition(arr, left, right);

        if (k == pivotIndex) {
            return arr[k];
        } else if (k < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivotIndex = left + rand.nextInt(right - left + 1);
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, right); // mover pivot al final

        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                swap(arr, storeIndex, i);
                storeIndex++;
            }
        }

        swap(arr, storeIndex, right); // mover pivot a su lugar final
        return storeIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // Demo con los ejemplos de la imagen
    public static void main(String[] args) {
        System.out.println(quickSelect(new int[]{4, 2, 7, 10, 4, 17}, 3)); // → 4
        System.out.println(quickSelect(new int[]{4, 2, 7, 10, 4, 1, 6}, 5)); // → 6
        System.out.println(quickSelect(new int[]{4, 2, 7, 1, 4, 6}, 1)); // → 1
        System.out.println(quickSelect(new int[]{9, 2, 7, 1, 7}, 4)); // → 7
    }
}
