class Solution {
    public boolean isValid(String s) {

        // There are Queues for First In First Out
        // Queue<Type> queue = new ArrayDeque<>();
        // offer(element): adds to the back of the queue
        // poll(): removes and returns the front most element; null if empty
        // peek(): shows the front element without removing

        // There are Stacks for First In Last Out
        // Deque<Type> stack = new ArrayDeque<>();
        // push(element) : puts element on top of stack
        // pop(): removes and returns top element
        // peek(): returns top element without removing

        Deque<Character> status = new ArrayDeque<>();
        char curr = ' '; 

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                status.push('(');

            } else if (s.charAt(i) == '{'){
                status.push('{');

            } else if (s.charAt(i) == '['){
                status.push('[');


                // ------ adding closing arguments

            } else if (!status.isEmpty()){
                if (s.charAt(i) == ')'){
                    curr = status.pop();
                    if (curr != '('){
                        return false; 
                    }

                } else if (s.charAt(i) == '}'){
                    curr = status.pop();
                    if (curr != '{'){
                        return false; 
                    }

                } else if (s.charAt(i) == ']'){
                    curr = status.pop();
                    if (curr != '['){
                        return false; 
                    }
                }
            }
            else{
                return false;
            }
        }

        if (!status.isEmpty()){
            return false;
        }

        return true;
        
    }


    /**
    What we learned 
    Hierarchy: Collections -> Queue -> Deque

    A Deque is a type of queue which can only do FIFO while a deque can change both ends. 

    For Queue use: add(), poll(), peek()
    Deque can use those methods and also pop(), addFirst(), addLast()
    **/
}
