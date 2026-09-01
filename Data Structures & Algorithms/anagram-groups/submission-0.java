class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // This method will return a lists of lists 
        // To see if two words are anagrams convert to a char Array and see if the arrays are equal
        // Use a hashmap with type string list that stores the anagrams 
        // iterate and store anagrams first 
        //check it against all the key values in the map before making a new key 

        Map<String, ArrayList<String>> tmpMap = new HashMap<>();

        for (String str : strs){
            char[] ans = str.toCharArray();
            Arrays.sort(ans);
            String tmpAns = String.valueOf(ans);

            if (tmpMap.containsKey(tmpAns)){
                ArrayList<String> curr = tmpMap.get(tmpAns);
                curr.add(str);
                tmpMap.put(tmpAns, curr);
            }
            else{
                ArrayList<String> sec = new ArrayList<>();
                sec.add(str); 
                tmpMap.put(tmpAns, sec);
            }
        }

        // iterate through map and combine all list 

        List<List<String>> ans = new ArrayList();

        for (List<String> sub : tmpMap.values()){
            ans.add(sub);
        }

        return ans;

        
    }
}

/**
Contains key does not work for objects since objects store a memory location
unlike primative types (int, string, bool) that store the actual value
**/
