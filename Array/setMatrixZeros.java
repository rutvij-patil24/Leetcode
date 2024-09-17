class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i,j;
        int row[] = new int[m];
        int col[] = new int[n];

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Correct initialization of 2D array
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        
        // Create an instance of Solution to call the non-static method
        Solution sol = new Solution();
        sol.setZeroes(matrix);
        
        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}