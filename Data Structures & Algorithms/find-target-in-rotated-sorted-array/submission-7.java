class Solution {
    public int search(int[] nums, int target) {
        // runtime to be o(logn) so must use binary search

        // first want tio find the pivot so you can split into two arrays. Use Binary search for
        // this

        int lft = 0;
        int rgt = nums.length - 1;

        int piv = 0;

        // until callapse onto one element will keep looking

        // found pivot when point left is greater then pivot and point on right less then pivot

        while (lft < rgt) {
            
            piv = lft + ((rgt - lft) / 2);

            if (nums[piv] == target) return piv; 

            if (nums[piv] > nums[rgt]) {
                // numbers must drop after current so move that direction
                lft = piv + 1;
            } else {
                // pivot is to the left 
                rgt = piv; 
            }
        }

        System.out.println("pivot at index " + piv); 


        // have the pivot positin or none was found so break into two arrays 

        if (nums[piv] == target) return piv; 

        int srt = 0; 
        int end = 0; 

        if (target > nums[nums.length - 1]) {
            // means the pivot is in other array
            srt = 0; 
            end = piv; 
        } else {
            srt = piv; 
            end = nums.length - 1; 
        }

        System.out.println(srt + ", start, end " + end); 

        // binary search one last time in the array pulled off 

        int mid = 0; 

        while (srt <= end){
            mid = srt + ((1 + end - srt)/2); 

            if (nums[mid] == target) return mid; 

            if (nums[mid] < target){
                srt = mid + 1; 
            } else {
                end = mid - 1; 
            }

        }

        return -1; 

    }
}
