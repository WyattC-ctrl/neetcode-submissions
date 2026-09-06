class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> defaultSet = new HashSet<>(Set.of('1','2','3','4','5','6','7','8','9'));
        
        Set<Character> currCol = new HashSet<>(defaultSet);
        Set<Character> currRow = new HashSet<>(defaultSet);
        Set<Character> col1 = new HashSet<>(defaultSet);

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
                        for (char c : col1){
                        }
                        if (!col1.remove(board[i][j]) && board[i][j] != '.'){
                            return false; 
                        }
                    }
                }
                col1 = new HashSet<>(defaultSet);
                w = w + 3;
            }
        }

        return true;
    }

    /**
    non primitive types point to the same object in memory so when you reinitialize objects you must do new <>(object) or it points to same object in memory
    **/
}
