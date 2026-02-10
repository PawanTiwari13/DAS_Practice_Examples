package DSA.Arrays.Easy;

public class RemoveDuplicateElement {

    public void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("After Sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public int removeDuplicate(int arr[]) {
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        
        
        return i + 1; // new length
        
    }

    public static void main(String[] args) {
        RemoveDuplicateElement duplicate = new RemoveDuplicateElement();

        int arr[] = {9, 5, 1, 7, 3, 8, 2, 5, 4, 10, 6};

//        duplicate.sort(arr);

        int newLength = duplicate.removeDuplicate(arr);
        
        System.out.println(" ");  
        System.out.println("Array after sorting and removing duplicates:");
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
