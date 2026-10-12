class Solution {
    public int[][] kClosest(int[][] points, int k) {

        // return the k closest poinst to orgin 
        // going based off eucliden distance 

        // whicher point has smaller sqrt since second point 00 

        // instead of messing iwth types do math out

        // better implementation would be a max heap and remove the furthest element each time once you have k elements 
            // would have o(nlogk) instead of o(nlogn) for the heap

        Comparator<int[]> eucClosest = (a,b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]) ;

        PriorityQueue<int[]> queue = new PriorityQueue<>(eucClosest); 

        for (int i = 0; i < points.length; i++){
            queue.offer(points[i]); 
        }


        int[][] ans = new int[k][];

        for (int i =0; i < k; i++){
            ans[i] = queue.poll(); 
        }

        return ans; 
        

    }
}
