class Solution {
    public int balancedStringSplit(String s) {
        int countR = 0;
        int countL = 0;
        int countStr = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                countR++;
            } else if (s.charAt(i) == 'L') {
                countL++;
            }

            if (countR == countL) {
                countStr++;
                countR = 0;
                countL = 0;
            }
        }

        return countStr;        
    }
}