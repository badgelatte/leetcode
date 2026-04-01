class Solution {
    public boolean judgeSquareSum(int c) {
        int start = 0;
        int end = (int) Math.sqrt(c);
        long sum = 0;

        while (start <= end) {
            sum = (long) start * start + (long) end * end;
            
            if (sum > c) {
                end--;
            } else if (sum < c) {
                start++;
            } else {
                return true;
            }
        }

        return false;
    }
}