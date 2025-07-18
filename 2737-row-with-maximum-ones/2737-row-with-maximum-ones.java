
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
      int maxCount = 0;
      int maxIndex = 0;

      for(int i = 0; i < mat.length; i ++)
      {
        int count = 0;
        for(int j = 0; j < mat[0].length; j ++){
            if(mat[i][j] == 1){
                count ++;
            }
        }
        if(count > maxCount){
            maxCount = count;
            maxIndex = i;
        }
      }
      return new int[]{maxIndex, maxCount};
    }
}