class Solution {
    public int findMin(int[] nums) {

        // runtime to be o(logn) so must use binary search 

        // first want tio find the pivot so you can split into two arrays. Use Binary search for this

        // looking for pivot which is point where left is greater then pivot and right is greater as well 

        int lft = 0; 
        int rgt = nums.length - 1; 

        int piv = 0; 

        // until callapse onto one element will keep looking 

        while (lft < rgt){
            piv = lft + (rgt - lft)/2; 

            if (nums[piv] > nums[rgt]){
                lft = piv + 1; 
            } else {
                rgt = piv; // piv may be the actual value and dont want to skip over it
            }
        }

        System.out.println("after loop: " + piv); 

        // found the pivot but find the least value 
        return nums[lft]; 
        
    }
}
