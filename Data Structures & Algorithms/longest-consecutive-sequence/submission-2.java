class Solution {
    public int longestConsecutive(int[] nums) {

        // consecutive elements must be one greater then previous elements but order does not matter 
        // so we can sort the array and find longets 
        // make this into a hashset and 
        // create a set with the current elements and track the largest current count 

        // have a set and an array and rmeove elements one by one 

        Arrays.sort(nums);

        //sort Nums is now sorted so we want to find the longest consecutirev integers 

        int currLong  = 1;

        int prevLong = 1; 

        if (nums.length == 0){
            return 0;
        }

        int prevInt = nums[0];

        for (int i : nums){
            if (i == prevInt + 1){
                currLong++;
                if (currLong > prevLong){
                    prevLong = currLong; 
                }
            }
            else if (prevInt == i){
                // dont reset count
            }
            else {
                currLong = 1;
            }
            prevInt = i; 
        }

        return prevLong;

        /**
        Use Arrays.sort() when you can
        read problem slower and consider all cases
        do base cases before anything so in case the length of an array is 0 you dont throw any errors
        **/

    
    }
}


