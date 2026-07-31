class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int R = matrix.length;
        int C = matrix[0].length;
        int i = 0,j=C-1;
        while(i < R && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}