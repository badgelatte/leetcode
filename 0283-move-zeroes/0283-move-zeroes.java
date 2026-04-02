class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> queue = new LinkedBlockingQueue<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                queue.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (!queue.isEmpty()) {
                nums[i] = queue.poll();
            } else {
                nums[i] = 0;
            }
        }
    }
} 