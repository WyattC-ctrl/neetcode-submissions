class Solution {
    public int[] twoSum(int[] nums, int target) {
        //check if any two indicies is equal to the target and cant be equal to themself 
        //sort the nums array 
        //having a pointer on each side if one is to large then move right pointer reight and if to small move left pointer left 

        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        int[] ans = {0,1};
        return ans;
    }

}
