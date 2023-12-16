package BinarySearch;

public class No704_BinarySearch {

    //{-1,0,3,5,9,12}, 9 => return 4
    public int search(int[] nums, int target) {
        return 1;
    }

    public int binarySearch(int[] nums, int start, int target) {
        int len = nums.length;
        if (len < 1) return -1;
        int pivot = len % 2;
        if (nums[pivot] == target) {
            return pivot;
        } else if (nums[pivot] < target) {
            pivot = (len - pivot) / 2;
        } else {
            pivot = pivot / 2;
        }
        return 1;
    }
}
