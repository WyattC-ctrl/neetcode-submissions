class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int initTar = 0;

        List<List<Integer>> ans  = new ArrayList<>();
        Set<List<Integer>> ansSet = new HashSet<>();

        Arrays.sort(nums);
        int k = 0; 
        int j = 0; 

        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i] > 0){
                break;
            }

            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            k = nums.length - 1; 
            j = i + 1; 
            while (j < k){
                if (nums[i] + nums[j] + nums[k] == 0){
                    // we can add it right away since we skip elements that are identical
                    ans.add(List.of(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]){
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]){
                        k--;
                    }
                    k--; 
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
