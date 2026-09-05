class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product = 1;
        int zCount  = 0;  
        int indx0 = -1; 
        int j = 0;    
        int[] ans = new int[nums.length]; 
   
        
        for (int i: nums){
            if (i != 0){
                product = product * i;
            }
            else {
                zCount++;
                indx0 = j;
                if (zCount > 1){
                    return ans;
                }
            }
            
            j++;
        }

        if (zCount == 1){
            ans[indx0] = product;
            return ans;
        }

        for (int i = 0; i < ans.length; i++){
            ans[i] = product/nums[i];
        }
        
        return ans;

    }
}  
