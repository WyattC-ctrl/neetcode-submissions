class Solution {
    public boolean isValid(String s) {
        // string of characters can only be parenthesis
        // if we have open we must have a close - use for open since every time open that should be
        // clsoed
        // also use a stack for the closed and compare items on stack

        Deque<Character> open = new ArrayDeque<>();

        // also have to use stack since ()[] or [{}]
        // ([{ }])

        boolean prevOpen = false;
        char[] str = s.toCharArray();

        for (char ch : str) {
            if (ch == '(') {
                open.push(')');
            } else if (ch == '['){
                open.push(']');
            } else if (ch == '{'){
                open.push('}');
            }
            else {
                if (!open.isEmpty()) {
                    char prev = open.pop();
                    if (prev != ch) {
                        return false;
                    }
                } else{
                    return false;
                }
            }
        }

        if (open.isEmpty()){
            return true; 
        }

        return false;
    }
}
