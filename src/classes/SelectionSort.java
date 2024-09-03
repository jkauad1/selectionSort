package classes;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int min_indice = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_indice]) {
                    min_indice = j;
                }
            }
            int aux = array[i];
            array[i] = array[min_indice];
            array[min_indice] = aux;
        }
    }
}
