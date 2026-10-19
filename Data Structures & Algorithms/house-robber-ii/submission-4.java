class Solution {
    public int rob(int[] nums) {

        // last and first neighbors 

        if (nums.length == 1){
            return nums[0]; 
        } else if (nums.length == 2){
            return Math.max(nums[0], nums[1]); 
        }

        // must have atleast 3 houses now

        int[] dp = new int[nums.length - 1]; 
        dp[0] = nums[0]; 
        dp[1] = Math.max(nums[0], nums[1]); 
        
        int[] dp2 = new int[nums.length - 1]; // cant rob first house
        dp2[0] = nums[1]; 
        dp2[1] = Math.max(nums[1], nums[2]); // start one index forward

        for (int i = 2; i < nums.length - 1; i++){ // can not rob last house
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]); 
            dp2[i] = Math.max(dp2[i-2] + nums[i + 1], dp2[i-1]);
        }

        int max1 = dp[dp.length - 1]; 

        int max2 = dp2[dp2.length - 1]; 

        return Math.max(max1, max2); 
        
    }
}
