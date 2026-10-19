class Solution {
    public int maxSubArray(int[] nums) {

        // iterate over array and keep track of sum and return largest 
        // depends where we should start the count 
        // sum can always be one int in array so next sum greater then previous then stop where at and start sum again from 0
        // check next element and if thats greater then max start count there instead

        // dynamic programming appraoch 

        if (nums.length == 0){
            return 0; 
        }
        if (nums.length == 1){
            return nums[0]; 
        }

        int max = nums[0]; 

        int[] dp = new int[nums.length]; 

        dp[0] = nums[0]; 
        dp[1] = Math.max(nums[0] + nums[1], nums[1]); 

        for (int i = 1; i < nums.length; i++){
            dp[i] = Math.max(nums[i] + dp[i-1], nums[i]); 
            max = Math.max(max, dp[i]); 
        } 

        return max; 
        
    }
}
