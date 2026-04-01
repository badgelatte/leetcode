class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int sum = 0;

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sum0 = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            start = i + 1;
            end = nums.length -1;

            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];

                if (sum == 0) {
                    sum0 = new ArrayList<>();
                    sum0.add(nums[i]);
                    sum0.add(nums[start]);
                    sum0.add(nums[end]);
                    list.add(sum0);
                    while (start < nums.length -1 && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    while (end > 1 && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    start++;
                    end--;
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return list;
    }
    
}