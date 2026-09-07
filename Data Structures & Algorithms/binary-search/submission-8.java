class Solution {
    public int search(int[] nums, int target) {

        // binary serach is where you keep plitting array in half and checking that one element if it is less then or greater then another element


        int mid = nums.length/2;
        int lft = 0; 
        int rgt = nums.length - 1; 


        while (lft <= rgt){

            if (nums[mid] == target){
                return mid; 
            } else if (nums[mid] < target){ 
                lft = mid + 1;
                mid = lft + (rgt-lft)/2;
            } else { 
                rgt = mid - 1;
                mid = rgt/2; 
            }
        }

        return -1; 
        
    }
}
