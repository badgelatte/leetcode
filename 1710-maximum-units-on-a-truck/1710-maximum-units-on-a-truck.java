class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int max = 0;
        int maxIndex = 0;
        int total = 0;
        
        for (int i = 0; i< boxTypes.length; i++) {
            for (int j = i + 1; j < boxTypes.length; j++) {
                max = i;

                if (boxTypes[max][1] < boxTypes[j][1]) {
                    boxTypes = swap (boxTypes, i , j);
                    max = j;
                } else if (boxTypes[max][1] < boxTypes[j][1] && boxTypes[max][0] < boxTypes[j][0]) {
                    boxTypes = swap (boxTypes, i , j);
                    max = j;
                }
            }

        }

        max = 0;

        for (int i = 0; i < boxTypes.length && max <= truckSize; i++) {
            max += boxTypes[i][0];

            if (max > truckSize){
                boxTypes[i][0] -= max - truckSize;
            }

            total +=  boxTypes[i][0] *  boxTypes[i][1];
        }

        return total;
    }

    public int[][] swap(int[][] arr, int i, int j) {
        int[] temp = new int[2];

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
}