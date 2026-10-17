class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> nums = new ArrayDeque<>(); 
        
        int ans1; 
        int ans2; 
        String op; 
        int tmp; 

        for (int i = 0; i < tokens.length; i++){
            String cur = tokens[i]; 
            if (cur.equals("+") || cur.equals("-") || cur.equals("*") || cur.equals("/")){
                ans2 = nums.poll(); 
                ans1 = nums.poll(); 
                switch(cur){
                    case "+":
                        tmp = ans1 + ans2; 
                        // add to front of queue, treat as stack
                        nums.push(tmp); 
                        break; 

                    case "-":
                        tmp = ans1 - ans2; 
                        nums.push(tmp); 
                        break; 

                    case "*":
                        tmp = ans1 * ans2; 
                        nums.push(tmp); 
                        break; 

                    case "/": 
                        tmp = ans1 / ans2; 
                        nums.push(tmp); 
                        break; 

                        
                } }else {
                    int num = Integer.valueOf(cur); 
                    nums.push(num); 
                }
        }

        int ans = nums.poll(); 

        return ans; 

        /** becase the order is not apways same we only get the last two nums that were on the stack */
    }
}
