class Solution {
    public int[] twoSum(int[] nums, int target) {
        // find out if any two integers sub to a target 
        // random ordering of integers so start by sorting the integers 

        //method does not specify what to do for if same index 

        int[] tmpNums = nums;

        int i = 0;
        int j = 1;

        for (int num : nums){
            j = i + 1;

            if (j > nums.length -1){
                return new int[] {-1, -1};
            }
            while (j < nums.length){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
                j++;
            }

            i++;
        }
        
        return new int[] {-1,-1};


        // // remember that since we are sorting this array the position of the indices change 
        // Arrays.sort(tmpNums); 

        // //now the array is in ascedning order: smallest -> largest
        // //we are guarenteed and answer 
        // //lets trace through the array with two points 

        // int i = 0;
        // // dont use () for length of array, length is a property variable not a method stored in memory
        // int j = tmpNums.length - 1; 
        // boolean found = false;

        // while (found != true){
        //     if (tmpNums[i] + tmpNums[j] == target){
        //         i = nums.indexOf(tmpNums[i]);
        //         j = nums.indexOf(tmpNums[j]);
        //         return new int[] {i,j};
        //     }

        //     if (tmpNums[i] + tmpNums[j] > target){
        //         j--;
        //     }
        //     else if (tmpNums[i] + tmpNums[j] < target){
        //         i++;
        //     }
        // }

        // return new int[] {0,0};
    }
}
