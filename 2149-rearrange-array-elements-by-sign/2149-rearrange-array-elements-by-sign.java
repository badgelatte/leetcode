class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positiveInt = new ArrayList<>();
        List<Integer> negativeInt = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) {
                negativeInt.add(num);
            } else {
                positiveInt.add(num);
            }
        }

        for (int i = 0; i < positiveInt.size(); i++) {
            nums[i * 2] = positiveInt.get(i);

            if (positiveInt.size() != negativeInt.size() && i >= negativeInt.size()) {
                continue;
            }

            nums[i * 2 + 1] = negativeInt.get(i);
        }

        return nums;
    }
}