class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> nums = new ArrayDeque<>(); 

        Deque<String> ops = new ArrayDeque<>(); 

        int ans1; 
        int ans2; 
        String op; 
        int tmp; 

        for (int i = 0; i < tokens.length; i++){
            String cur = tokens[i]; 
            if (cur.equals("+") || cur.equals("-") || cur.equals("*") || cur.equals("/")){
                ops.offer(cur); 

                ans2 = nums.poll(); 
                ans1 = nums.poll(); 
                op = ops.poll(); 

                switch(op){
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

        // int ans1; 
        // int ans2; 
        // String op; 
        // int tmp; 

        // // if ops is not empty there mustt be two nums in list

        // while (!ops.isEmpty()){
            
        //     ans2 = nums.poll(); 
        //     ans1 = nums.poll(); 
        //     op = ops.poll(); 

        //     switch(op){
        //         case "+":
        //             tmp = ans1 + ans2; 
        //             // add to front of queue, treat as stack
        //             nums.push(tmp); 
        //             break; 

        //         case "-":
        //             tmp = ans1 - ans2; 
        //             nums.push(tmp); 
        //             break; 

        //         case "*":
        //             tmp = ans1 * ans2; 
        //             nums.push(tmp); 
        //             break; 

        //         case "/": 
        //             tmp = ans1 / ans2; 
        //             nums.push(tmp); 
        //             break; 

        //     }

        // }

        int ans = nums.poll(); 

        return ans; 
    }
}
