package DSA.Arrays.Easy;

import java.util.Scanner;

public class RotateArray {

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 2, 4, 6, 3, 7, 1, 9, 8, 10};
        System.out.println("Enter the K'th element to rotate");
        int k = sc.nextInt();

        obj.rotateByK(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
