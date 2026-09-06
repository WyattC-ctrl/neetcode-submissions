class Solution {
    public int maxProfit(int[] prices) {

        // given the array of integers find the max difference 
        // dont change the order 
        // sort through the array keeping track of the mnax and if the numbers ar edecrasing or increasing 

        int maxProf = 0; 
        int currProf = 0; 
        int profTrans = 0; 
        int buy = prices[0]; 
        for (int i = 0; i < prices.length; i++){
            System.out.println(buy);
            
            profTrans = prices[i] - buy;

            if (profTrans > 0){
                currProf = profTrans;
                if (currProf > maxProf){
                    maxProf = currProf; 
                }
            } 
            else {
                // if it is a negative profit we dont care abiout loosing sell date we already store profit so we can set the new buy to the lower number 
                buy = prices[i];
            }
        
        }
        return maxProf; 
        
    }
}
