class Solution {
    public int rob(int[] nums) {

        // last and first neighbors 

        if (nums.length == 1){
            return nums[0]; 
        } else if (nums.length == 2){
            return Math.max(nums[0], nums[1]); 
        }

        int max1 = robA(nums, 0); 

        int max2 = robA(nums, 1); 

        return Math.max(max1, max2); 
        
    }


    private int robA(int[] nums, int start){
        int[] dp = new int[nums.length - 1]; 
        dp[0] = nums[start]; 
        dp[1] = Math.max(nums[start], nums[start + 1]); 

        for (int i = 2; i < nums.length - 1; i++){ // can not rob last house
            dp[i] = Math.max(dp[i-2] + nums[start + i], dp[i-1]); 
        }

        int max = dp[dp.length - 1]; 

        return max;



    }
}
