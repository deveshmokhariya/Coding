class Solution {
    public int[][] transpose(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int ans[][] = new int[C][R];
        for(int i = 0 ; i<R; i++){
            for(int j = 0; j<C; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}