class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product = 1; 
        // you dont even have to use a set because if it has mnore then one zero value all elements will be 0
        int zCount  = 0;  
        int indx0 = -1; 
        int j = 0;        
        
        for (int i: nums){
            if (i != 0){
                product = product * i;
            }
            else {
                // if we ever get a zero then know true product is zero
                zCount++;
                indx0 = j;
            }
            j++;
        }
        
        int[] ans = new int[nums.length]; 

        if (zCount > 1){
            return ans; 
        }

        if (zCount == 0){
            for (int i = 0; i < nums.length; i++){
                ans[i] = product/nums[i];
            } 
        }
        else{
            ans[indx0] = product; 
            return ans;
        }

    
        return ans; 

    }
}  
