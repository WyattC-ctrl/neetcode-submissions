class MinStack {

    // private instance variables only able to access in this class
    private Deque<Integer> stack; 
    private Integer min; 
    private Deque<Integer> minStack; 


    public MinStack() {
        // constructor of the class
        // initilizes the private instance variables
        stack = new ArrayDeque<>(); 
        minStack = new ArrayDeque<>();
        min = null; 
    }
    
    public void push(int val) {
        stack.push(val);
       
       // whenever you push an element to a astack determine if its larger or smaller then current min
       if (minStack.isEmpty()){
        minStack.push(val);
       } else {
        // this works because we keep stack and minStack concurrent with each other so when we push a new value to the stack we push a minimum as well and that minimum is the current minimum in the stack or the value if its less
        int toAdd = Math.min(val, minStack.peek());
        minStack.push(toAdd);
       }
        
    }
    
    public void pop() {
        minStack.pop();
        stack.pop();   
    }
    
    public int top() {
        int tmpTop = stack.peek();
        return tmpTop;
        
    }
    
    public int getMin() {
        return minStack.peek(); 
    }
}
