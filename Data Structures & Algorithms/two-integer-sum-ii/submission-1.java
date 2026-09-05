class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];
        
        int j = numbers.length - 1; 
        int i = 0;
        int currSum = numbers[0] + numbers[1];

        while(i < numbers.length){
        
            currSum = numbers[i] + numbers[j];

            if (currSum == target){
                ans[0] = i + 1; 
                ans[1] = j + 1; 
                return ans;
            }
            else if (numbers[i] + numbers[j] < target){
                i++; 
            }
            else {
                j--;
            }
        }
        return ans;
    }
}
