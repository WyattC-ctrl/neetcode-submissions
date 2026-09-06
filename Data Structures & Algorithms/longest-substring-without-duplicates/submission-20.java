class Solution {
    public int lengthOfLongestSubstring(String s) {

        int count = 0; 

        int max = 0; 

        Set<Character> tmpSet = new HashSet<>();

        //dont have to do a new string since tring obvjects are immutavpe so everytime you do a method on a string oibject it creates a new string in memory
        String curr = "";

        int left = 0; 

        int indx = -1; 

        for (int i = 0; i < s.length(); i ++){
            if (!tmpSet.contains(s.charAt(i))){
                tmpSet.add(s.charAt(i));
                count++; 
                if (count > max){
                    max = count; 
                }
            }
            else {
                while (tmpSet.contains(s.charAt(i))){
                    tmpSet.remove(s.charAt(left));
                    count --;
                    left++;
                    
                }
                tmpSet.add(s.charAt(i));
                count++;
            }
        }

        return max;
        
    }
}
