package DSA.Arrays;

public class MoveZero {

    public void moveZero(int arr[]) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
        for (int j : arr) {
            System.out.print(" " + j + "");
        }
    }

    public static void main(String[] args) {
        MoveZero mz = new MoveZero();
        int arr[] = {5, 2, 4, 0, 6, 3, 0, 7, 1, 0, 9, 0, 8, 10, 0};
        mz.moveZero(arr);
    }

}
