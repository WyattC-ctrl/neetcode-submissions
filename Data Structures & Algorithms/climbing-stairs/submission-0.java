class Solution {
    public int climbStairs(int n) {

        // dynamic programming question
        // find total number ways to climb to top and final answer must be permutation of others

        // last step is either n-2 or n-1, step before that n-4, n-3

        // base case 

        if (n <= 2){
            return n; 
        }

        int[] numSteps = new int[n + 1];

        numSteps[1] = 1;  
        numSteps[2] = 2; // one step at time or two

        // find all ways we can get to first step then second step and multiply

        for (int i = 3; i < n + 1; i ++ ){

            numSteps[i] = numSteps[i - 1] + numSteps[i - 2];  

        }

        return numSteps[n]; 
        
    }
}
