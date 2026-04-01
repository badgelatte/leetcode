class Solution {
    public int maxArea(int[] height) {
        int waterMax = 0;
        int water = 0;
        int start = 0;
        int end = height.length - 1;

        while (start != end) {
            water = (end - start) * Math.min(height[start] , height[end]);

            if(waterMax < water) {
                waterMax = water;
            }

            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }

        return waterMax;
    }
}