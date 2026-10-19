class Solution {
    public int countSubstrings(String s) {
        // find the number f substrings that are palindromes

        // check if have a substring then check if conatined in the set then return the size of set 

        int count = 0; 

        for (int i = 0; i < s.length(); i++){
            count = count + validPalin(s, i, i) + validPalin(s, i, i+1); // checks even then odd
        }

        return count; 
        
    }

    private int validPalin(String s, int start, int end){
        // we can count the number of substrings that have a center located at start center end 

        int i = start; 

        int j = end; 

        int count = 0; 

        while (i >= 0 && j < s.length()){
            if (s.charAt(i) != s.charAt(j)){
                break; 
            }
            count++; 
            i--; 
            j++;
        }

        return count; 
    }
}
