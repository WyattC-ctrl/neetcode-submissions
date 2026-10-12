class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // we want to return the most frequent items in the array nums as a integer array 
        // create a map and have it hold the frequency of each elemenmt


        // PriorityQueue instead to hold values 

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
