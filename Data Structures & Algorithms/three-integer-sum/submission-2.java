class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int initTar = 0;

        List<List<Integer>> ans  = new ArrayList<>();
        Set<List<Integer>> ansSet = new HashSet<>();

        Arrays.sort(nums);
        int k = 0; 
        int j = 0; 

        for (int i = 0; i < nums.length - 2; i++){
            k = nums.length - 1; 
            j = i + 1; 
            while (j < k){
                if (nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> tmp = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                    Collections.sort(tmp);
                    ansSet.add(tmp);
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
