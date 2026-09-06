class Solution {
    public int lengthOfLongestSubstring(String s) {

        //s.toLowerCase();

        int count = 0; 

        int max = 0; 

        //dont have to do a new string since tring obvjects are immutavpe so everytime you do a method on a string oibject it creates a new string in memory
        String curr = "";

        int indx = -1; 

        for (int i = 0; i < s.length(); i ++){
            if (curr.indexOf(s.substring(i, i+1)) == -1){
                curr = curr + s.substring(i, i+1);
                count++; 
                if (count > max){
                    max = count; 
                }
            }
            else {
                indx = curr.indexOf(s.substring(i,i+1));
                count = count - (indx+1); 
                if (indx < s.length() - 1){
                    curr = curr.substring(indx+1);
                    curr = curr + s.substring(i, i+1);
                    count++;
                }
            }
        }

        return max;
        
    }
}
