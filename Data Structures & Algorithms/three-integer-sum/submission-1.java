class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // search the array and find any time that the sum of three numbers is equal to 0
        // can get first number then can split second number into a new array and pretend as if we are searching a second array for that target, treating as two sums. This will be O(N^2) time complexity

        int initTar = 0;

        List<List<Integer>> ans  = new ArrayList<>();
        Set<List<Integer>> ansSet = new HashSet<>();

        // since we sorted in the begining we dont have to keep checking forward and back sicen we would ahve found it in the begining so we can cut the array there 
        Arrays.sort(nums);
        int k = 0; 
        int j = 0; 

        for (int i = 0; i < nums.length - 2; i++){
            // consider the elements left over in the array and see if they can sum to 0 with the other nums[i]
            k = nums.length - 1; 
            j = i + 1; 

            // treat everything now as two sum 
            while (j < k){
                if (nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> tmp = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                    Collections.sort(tmp);
                    ansSet.add(tmp);
                    // we cant have same list cant conatin duplicate inputs 
                    j++;
                     
                }
                else if (nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }
                else {
                    j++;
                }
            }
            
        }


        for (List<Integer> ls : ansSet){
            ans.add(ls); 
        }

        return ans;

    }
}
