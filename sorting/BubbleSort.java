
public class BubbleSort {

    public class BubbleSort {
        public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
        // Swap array[j] and array[j+1]
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
        }
        }
        }
        }
        public static void main(String[] args) {
        int[] myArray = {5, 1, 4, 2, 8};
        bubbleSort(myArray);
        System.out.println("Sorted array:");
        for (int element : myArray) {
        System.out.print(element + " ");
        }
        }
       
    
}