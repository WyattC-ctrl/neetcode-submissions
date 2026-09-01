class Solution {
    public int[] twoSum(int[] nums, int target) {
        // find out if any two integers sub to a target 
        // random ordering of integers so start by sorting the integers 

        //method does not specify what to do for if same index


        // faster time complexity to use a HashMap instead 

        Map<Integer, Integer> tmpNums = new HashMap<>();

        int tmpTarget = 0; 

        for (int i = 0; i < nums.length; i++){
            tmpTarget = target - nums[i]; 

            if (tmpNums.containsKey(tmpTarget)){
                // notice how i is second since we know we will have already iterated through that number
                return new int[] {tmpNums.get(tmpTarget), i};
            }

            //else if thats not the correct item we want toa dd that number and the index to the map
            //since its only two numebrd we dont have to worry about repeas if we did have to wory abou 
            //repeats we would wnat to do type ArrayList in Map

            tmpNums.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
