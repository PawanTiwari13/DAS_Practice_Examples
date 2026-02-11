package DSA.Arrays.Easy;

import java.util.Scanner;

public class RotateArray {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
// ye Optimize code hai jaha 
    public static void rotateByKOpt(int arr[], int k) {
        int n = arr.length;
        if (n == 0) {
            return;
        }
        k = k % n;
        if (k < 0) {
            k = k + n;
        }
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public void rotateByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 2, 4, 6, 3, 7, 1, 9, 8, 10};
        System.out.println("Enter the K'th element to rotate");
        int k = sc.nextInt();
        rotateByKOpt(arr, k);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
