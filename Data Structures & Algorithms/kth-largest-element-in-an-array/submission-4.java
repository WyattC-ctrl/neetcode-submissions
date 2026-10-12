class Solution {
    public int findKthLargest(int[] nums, int k) {

        // Faster implementation would be min heap of size k

        Set<Integer> numSet = new HashSet<>();

        Arrays.sort(nums); 

        return nums[nums.length - k]; 
        
    }
}