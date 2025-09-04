package data_structures;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int num1;
        int num2;
        int sum;
        int[] result = new int[2];

        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++ ) {
                num1 = nums[i];
                num2 = nums[j];
                sum  = num1 + num2;
                if(sum == target) {
                    result[0] = num1;
                    result[1] = num2;
                    return result;
                }

            }
        }
        return result;
    }
}
