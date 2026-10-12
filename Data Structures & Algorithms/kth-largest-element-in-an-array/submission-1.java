class Solution {
    public int findKthLargest(int[] nums, int k) {

        // add everything to a priorityqueue max priority queue and only keeping the kth largest 
        // max priority to obtain O(NlogK) instead of O(NlogN)

        Set<Integer> numSet = new HashSet<>();

        Arrays.sort(nums); 

        int count = 0; 

        for (int i = nums.length -1 ; i >= 0; i-- ){
            count++; 
            if (count == k){
                    return nums[i]; 
            }
        }

        return 0; 
        
    }
}