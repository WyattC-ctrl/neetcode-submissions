class Solution {
    public int[] topKFrequent(int[] nums, int k) { 

        Map<Integer, Integer> tmpMap = new HashMap<>(); 

        for (int num: nums){
            if (tmpMap.containsKey(num)){
                tmpMap.put(num, tmpMap.get(num) + 1);
            }
            else{
                tmpMap.put(num, 0); 
            }
        }

        //since this is a priorityqueue this puts the smaller one on top
        // using a comparator when supplying (a,b) if function is negative then a comes first; if positive b comes first 
        // b-a always larger goes first; since if negative a goes first and if positive b goes first
        // a-b if negative b is larger so a goes first and if positive a is larger so b goes first 
        // always think of it as positive then b negative then a 

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        int[] ans = new int[k]; 

        for (Map.Entry<Integer, Integer> item : tmpMap.entrySet()){
            heap.offer(item); 
        }

        for (int i = 0; i < k ; i++){

            ans[i] = heap.poll().getKey();

        }

        return ans;         
    }
}
