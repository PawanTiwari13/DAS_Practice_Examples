package DSA.Arrays.Easy;

import java.util.Arrays;

public class FindDuplicate {

    public void findDupicate(int arr[]) {
        Arrays.sort(arr);
        System.out.print("Duplicates are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(" " + arr[i] + " ");
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        FindDuplicate fd = new FindDuplicate();
        int arr[] = {9, 5, 1, 7, 3, 6, 8, 2, 5, 2, 4, 10, 6, 2};
        fd.findDupicate(arr);
    }
}
