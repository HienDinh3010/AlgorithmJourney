package company.assessment.com3;

public class FairIndexes {

    public int countIndexes(int[] A, int[] B) {
        // Write your code here.
        int sumA = 0, sumB = 0, len = A.length, count = 0;
        int[] arr = new int[4];
        for (int i = 0 ; i < len; i++) {
            sumA = sumA + A[i];
            sumB = sumB + B[i];
        }
        for (int i = 0; i < len; i++) {
            arr[0] = arr[0] + A[i];
            arr[1] = sumA - arr[0];
            arr[2] = arr[2] + B[i];
            arr[3] = sumB - arr[2];
            if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
                count++;
            }
        }
        return count;
    }
}
