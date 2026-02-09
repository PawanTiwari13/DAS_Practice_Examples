package DSA.Arrays;

public class LarggestNumber {

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void LarggesElement(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        int n = arr[arr.length - 1];
        System.out.println("The Number is : " + n);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {
        LarggestNumber larggestNumber = new LarggestNumber();
        int arr[] = {9, 2, 6, 4, 77, 22, 66, 101};
        larggestNumber.LarggesElement(arr);
    }
}
