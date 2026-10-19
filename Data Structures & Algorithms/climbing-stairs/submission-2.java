class Solution {
    public int climbStairs(int n) {

        if (n <= 2){
            return n; 
        }

        int[] numSteps = new int[n + 1];

        numSteps[1] = 1;  
        numSteps[2] = 2; // one step at time or two

        for (int i = 3; i < n + 1; i ++ ){

            numSteps[i] = numSteps[i -1] + numSteps[i - 2];  

        }

        return numSteps[n]; 
        
    }
}
