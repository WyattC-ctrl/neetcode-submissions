class Solution {
    public int[][] merge(int[][] intervals) {


        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        Deque<int[]> stack = new ArrayDeque<>(); 

        for (int i = 0; i < intervals.length; i++){

            if (!stack.isEmpty()){
                int end = stack.peek()[1];
                if (end >= intervals[i][0]){
                    int[] ele = stack.pop(); 
                    int fin = Math.max(ele[1], intervals[i][1]);
                    ele[1] = fin; 
                    stack.push(ele); 
                } else {
                    stack.push(intervals[i]); 
                }
            } else {
                stack.push(intervals[i]); 
            }
        }

        int[][] mergeIn = new int[stack.size()][2]; 

        int i = 0; 

        while (!stack.isEmpty()){
            int[] val = stack.pop(); 
            mergeIn[i] = val; 
            i++;
        }

        return mergeIn; 
        
    }
}
