public static void insertionSort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; ++i) {
    int key = array[i];
    int j = i - 1;
    /* Move elements of array[0..i-1], that are greater than key,
    to one position ahead of their current position */
    while (j >= 0 && array[j] > key) {
    array[j + 1] = array[j];
    j = j - 1;
    }
    array[j + 1] = key;
    }
    }
    public static void main(String[] args) {
    int[] myArray = {12, 11, 12, 13, 5, 6};
    insertionSort(myArray);
    System.out.println("Sorted array:");
    for (int element : myArray) {
    System.out.print(element + " ");
    }
    }
    class InsertionSort {
    
}
