class Solution {
    public int maxArea(int[] heights) {
        int i = 0; 
        int j = heights.length - 1; 
        int mxA = 0;
        int currA = 0;  

        while (i < j){
            currA = Math.min(heights[i], heights[j]) * (j-i);
            if (currA > mxA){
                mxA = currA;
            }

            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }

        }    

        return mxA;    
    }
}
