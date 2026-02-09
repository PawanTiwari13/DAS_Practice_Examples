package DSA.Arrays;

public class SortArray {

// Check if array is sorted
    public static boolean checkArrayIsSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int arr[] = {9, 5, 7, 6, 1, 4, 8, 2};
        if (checkArrayIsSorted(arr)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array isn' Sorted");

        }
    }
}
