class Solution {
    public boolean hasDuplicate(int[] nums) {
        // simplest apporach is to do a for looop inside a for loop and go half way 

        for (int i = 0; i < nums.length ; i++){
            
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true; 
                }
            }
        
        }

        return false; 

    }
}