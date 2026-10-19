class Solution {
    public String longestPalindrome(String s) {

        // center of palidrome 

        // center of word and if that is 

        int max = 0; 

        int[] ans = new int[2]; 

        for (int i = 0; i < s.length() - 1; i++){

            int[] word = isPal(s, i, i); 
            int[] word2 = isPal(s, i, i+1); 
            if (word[1] - word[0] < word2[1] - word2[0]){
                word = word2; 
            }

            if (max < (word[1] - word[0])){
                max = word[1] - word[0];
                ans = word; 
            }

        }

        String str = s.substring(ans[0], ans[1] + 1); 

        return str; 
        
    }

    private int[] isPal(String s, int lft, int rgt){ 

        int i = lft; 
        int j = rgt;

        // left moves left, right moves right
        
        while (i >= 0 && j < s.length()){
            if (s.charAt(i) != s.charAt(j)){
                break; 
            }
            i--; 
            j++;   
        }

        i = i + 1; // after leave loop still have one added 
        j = j - 1; 
        return (new int[]{i,j}); 
    }

}
