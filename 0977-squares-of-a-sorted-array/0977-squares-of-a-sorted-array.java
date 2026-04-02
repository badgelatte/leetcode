class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[nums.length];

        for (int i = result.length - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) < nums[end]) {
                result[i] = (int) Math.pow(nums[end--], 2);
            } else {
                result[i] = (int) Math.pow(nums[start++], 2);
            }
        }

        return result;
    }
}