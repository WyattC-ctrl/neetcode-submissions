class Solution {
    public boolean isPalindrome(String s) {

        String filtered = s.replaceAll("[^a-zA-Z0-9]", "");

        filtered = filtered.toLowerCase();
        int j = filtered.length() - 1; 

        for (int i = 0; i < filtered.length() / 2; i++){
            if (!filtered.substring(i,i+1).equals(filtered.substring(j, j+1))){
                return false; 
            }
            j--; 
        }

        return true; 

        // for future if you only wnat the character you do do charAt() instead of a string and will return the character type char at that position

        
    }
}
