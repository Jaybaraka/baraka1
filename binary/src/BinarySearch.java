public class BinarySearch {
    public class BinarySearch {
        public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
        int mid = left + (right - left) / 2;
        if (array[mid] == key) {
        return mid; // Element found
        }
        if (array[mid] < key) {
        left = mid + 1;
        } else {
        right = mid - 1;
        }
        }
        return -1; // Element not found
        }
        public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int key = 4;
        int result = binarySearch(myArray, key);
        if (result != -1) {
        System.out.println("Element found at index: " + result);
        } else {
        System.out.println("Element not found");
        }
        }
       }
}
