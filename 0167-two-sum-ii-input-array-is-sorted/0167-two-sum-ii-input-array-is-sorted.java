class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[1] = i + 1;
                    result[0] = j + 1;

                    return result;
                }
            }
        }

        return result;
    }
}