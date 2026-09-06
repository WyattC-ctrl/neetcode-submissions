class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check if a 2d array makes a valid sudoku board 
        // we need to check that the digits 1-9 are containted on the board in correct positions 
        // anytime there is a failure can STOP not valid 

        // each 3x3 must conatin digits 1-9 no duplicates and each column must contain digits 1-9 no duplicates 
        // lets check 3 columns at a time 
        // 3 running variables for each clumn tracking the numbers 
        // make sure 3x3 on top is valid then make sure 3x3 below is valid 
        // then move right


        Set<Character> defaultSet = new HashSet<>(Set.of('1','2','3','4','5','6','7','8','9'));
        
        Set<Character> currCol = new HashSet<>(defaultSet);
        Set<Character> currRow = new HashSet<>(defaultSet);
        Set<Character> col1 = new HashSet<>(defaultSet);
        Set<Character> col2 = defaultSet;
        Set<Character> col3 = defaultSet;

        // start off by checking every single columns

        // to get number of rows of a 2d array board.length
        // to get number of columns of a 2d array board[0].length


        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                //notice how (i,j) -> (j,i) since we are chekcing columns not rows 
                if (!currCol.remove(board[j][i]) && board[j][i] != '.'){
                    return false; 
                }

                if (!currRow.remove(board[i][j]) && board[i][j] != '.'){
                    return false; 
                }
            }
            // restart the set and check the next one
            currCol = new HashSet<>(defaultSet);
            currRow = new HashSet<>(defaultSet);
        }

        // we checked all rows and columns above now need to check the matrix

        int w = 0; 
        int v = 0; 

        for (int z = 0; z < 3; z++){
            w = 0; 
            v = v + 3;
            while (w < board.length){
                for (int i = w; i < w+3; i++){
                    for (int j = v-3; j < v; j++){
                        System.out.println("removing " + board[i][j] + " here ");
                        for (char c : col1){
                            System.out.println(c);
                        }
                        if (!col1.remove(board[i][j]) && board[i][j] != '.'){
                            
                            System.out.println(w + "  " + v + " " + i + " " + j+ "   " + board[i][j]);
                            return false; 
                        }
                    }
                }
                System.out.println("resetting set ------------ ");

                System.out.println("resetting set");
                col1 = new HashSet<>(defaultSet);
                w = w + 3;
            }
        }

        return true;
    }
}
