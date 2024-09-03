import static classes.SelectionSort.selectionSort;


public class Main {
    public static void main(String[] args) {
        int[] array = {22, 4, 12, 5, 6, 1, 2, 10};

        selectionSortNoPelo(array);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        }

        public static void selectionSortNoPelo(int[] array){
            for (int i = 0; i < array.length; i++){ // Here we start the external loop that will run through the array

                int min_indice = i;//Although it is redundant in this case, ill leave it here for convention.
                                   //it would be used to access the index of the arrays

                for (int j = i + 1; j < array.length; j++){ //Internal loop that will make the comparision
                    if (array[j] < array[min_indice]){      //between array[j] and the array[min_indice]
                        swap(array, min_indice, j);  //call of the swap method.
                    }
                }
            }
        }

        private static void swap(int[] array, int a, int b){
            int aux = array[a];
            array[a] = array[b];
            array[b] = aux;
        }
    }