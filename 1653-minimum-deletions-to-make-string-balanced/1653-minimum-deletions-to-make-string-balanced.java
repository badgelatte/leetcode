class Solution {
    public int minimumDeletions(String s) {
        int numB = 0;
        int minDel = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                minDel = Math.min(numB, minDel + 1);
            } 
            else {
                numB++;
            }
        }

        return minDel;
    }
}