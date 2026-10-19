class Solution {
    public boolean canJump(int[] nums) {
        // cant skip over posotion must go on each 

        // indicates max jump length so you may not jump full length

        // each time we have to choose should we jump full length or not

        // dont choose max index every time but what gets to safe position or end 
        // matter which position is safe

        if (nums.length == 0 || nums.length == 1){
            return true; 
        }

        if (nums[0] == 0){
            return false; 
        }
        
        int pos = 0; 

        int[] tmp = new int[nums.length]; 
        tmp[0] = nums[0]; 

        for (int i = 1; i < nums.length - 1; i++){
            tmp[i] = Math.max(tmp[i-1] - 1, nums[i]); 
            System.out.println(tmp[i]); 
            if (tmp[i] >= nums.length){
                return true; 
            }
            if (tmp[i] <= 0){ // not 0 go on
                return false; 
            }
        }


        return true; 
        
    }
}
