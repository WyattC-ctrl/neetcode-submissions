class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> tmpSet = new HashSet<>(); 

        for (int num : nums){
            if (tmpSet.contains(num)){
                return true; 
            }
            tmpSet.add(num);
        }

        return false; 
 
    }
}