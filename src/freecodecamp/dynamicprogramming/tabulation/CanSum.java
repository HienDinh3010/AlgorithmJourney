package freecodecamp.dynamicprogramming.tabulation;

/**
 * Write a function canSum(targetSum, numbers) that takes in a targetSum
 * and an array of numbers as arguments
 * The function should return a boolean indicating whether it is
 * possible to generate the targetSum using numbers from the array
 */
public class CanSum {
    static boolean canSum(int targetSum, int[] numbers) {
        boolean[] table = new boolean[targetSum + 1];
        table[0] = true;
        for (int i = 0; i <= targetSum; i++) {
            if (table[i]) {//if my current position is reachable
                for (Integer num: numbers) {
                    if (i + num <= targetSum) {
                        table[i + num] = true;// then set true here
                    }
                }
            }
        }
        return table[targetSum];
    }

    public static void main(String[] args) {
        System.out.println(canSum(7, new int[]{5, 3 , 4}));
        System.out.println(canSum(7, new int[]{5, 3 , 4, 7}));
        System.out.println(canSum(7, new int[]{2 , 4}));
        System.out.println(canSum(8, new int[]{2 , 3, 5}));
        System.out.println(canSum(300, new int[]{7, 14}));
    }
}
