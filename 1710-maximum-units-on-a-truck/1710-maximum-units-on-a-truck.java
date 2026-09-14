class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, Comparator.comparingInt(o -> o[1]));

        int capacity = truckSize;
        int finalValue = 0;

        for(int i = boxTypes.length - 1; i >= 0; i--) {

            int boxes = boxTypes[i][0];
            int units = boxTypes[i][1];

            if(capacity >= boxes) {
                finalValue += boxes * units;
                capacity -= boxes;
            }
            else {
                finalValue += capacity * units;
                capacity = 0;
                break;
            }
        }

        return finalValue;
    }
}