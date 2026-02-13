package DSA.Arrays.Medium;

public class MergeWithoutExtraSpace {

    public static void merge(long[] arr1, long[] arr2, int n, int m) {

        int gap = (n + m + 1) / 2;

        while (gap > 0) {

            int i = 0;
            int j = i + gap;

            while (j < n + m) {

                // i in arr1, j in arr1
                if (i < n && j < n) {
                    if (arr1[i] > arr1[j]) {
                        long temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                } // i in arr1, j in arr2
                else if (i < n && j >= n) {
                    if (arr1[i] > arr2[j - n]) {
                        long temp = arr1[i];
                        arr1[i] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                } // i in arr2, j in arr2
                else {
                    if (arr2[i - n] > arr2[j - n]) {
                        long temp = arr2[i - n];
                        arr2[i - n] = arr2[j - n];
                        arr2[j - n] = temp;
                    }
                }

                i++;
                j++;
            }

            if (gap == 1) {
                break;
            }
            gap = (gap + 1) / 2;
        }
    }

    public static void main(String[] args) {
        long[] arr1 = {1, 4, 7, 8, 10};
        long[] arr2 = {2, 3, 9};

        merge(arr1, arr2, arr1.length, arr2.length);

        for (long x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (long x : arr2) {
            System.out.print(x + " ");
        }
    }
}
