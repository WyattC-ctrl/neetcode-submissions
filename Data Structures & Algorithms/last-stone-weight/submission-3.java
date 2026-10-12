class Solution {
    public int lastStoneWeight(int[] stones) {

        // given array of integers 

        // create a max PriorityQueue and poll off the first and second smash toegtehr and add back onto the queue

        // go until no stones remain 


        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b - a); 

        for (int stone : stones){
            queue.offer(stone); 
        }

        int stone1;
        int stone2; 


        while (queue.size() > 1){

            stone1 = queue.poll();

            stone2 = queue.poll(); 

            if (stone1 != stone2){
                // we know stone1 is heavier since pulled off queue sooner

                stone1 = stone1 - stone2;
                queue.offer(stone1); 
            }

        }

        if (queue.size() == 1) {
            int last = queue.poll(); 
            return last;
        }
        else {
            return 0;
        }        
    }
}
