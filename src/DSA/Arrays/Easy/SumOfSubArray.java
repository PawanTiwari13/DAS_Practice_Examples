package DSA.Arrays.Easy;

public class SumOfSubArray {

    public void findSumOfSubArray(int arr[]) {
        int cSum = 0, mSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cSum += arr[i];

            if (cSum > mSum) {
                mSum = cSum;
            }
            if (cSum < 0) {
                cSum = 0;
            }
        }
        System.out.println(mSum);
    }

}
