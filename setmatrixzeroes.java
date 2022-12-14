class Solution {
    public void setZeroes(int[][] matrix) {
        boolean col=false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0) col=true;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[0].length-1;j>=1;j--){
                if(matrix[i][0]==0 || matrix[0][j]==0){ matrix[i][j]=0;}
               // if(col==true) {matrix[i][0]=0;}
            }
        }
         if (matrix[0][0] == 0) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[0][j] = 0;
      }
    }

    // See if the first column needs to be set to zero as well
    if (col) {
      for (int i = 0; i < matrix.length; i++) {
        matrix[i][0] = 0;
      }
    }
    }
}
