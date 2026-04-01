class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int count1 = 0;
        int count2 = 0;
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (count1 < nums1.length && count2 < nums2.length) {
            if (nums1[count1] == nums2[count2] && !list.contains(nums1[count1])) {
                list.add(nums1[count1++]);
                count2++;
            } else if (nums1[count1] < nums2[count2]) {
                count1++;
            } else {
                count2++;
            }
        }
        
        int[] resultArr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            resultArr[i] = list.get(i);
        }

        return resultArr;
    }
}