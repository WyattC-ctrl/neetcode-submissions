class Solution {
    public boolean isAnagram(String s, String t) {
        //put both words in an array then go through the array and remove elements 
        //sort both words then compare letter by letter 
        //use a map and use characters as keys and 

        if (s.length() != t.length()){
            return false; 
        }

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();


        for (int i = 0; i < s.length(); i++){
            if (map1.containsKey(s.substring(i,i+1))){
                String cha = s.substring(i,i+1);
                map1.put(cha, map1.get(cha)+1);
            }
            else {
                map1.put(s.substring(i,i+1), 1);
            }
        }

        for (int i = 0; i < t.length(); i++){
            if (map2.containsKey(t.substring(i,i+1))){
                String cha = t.substring(i,i+1);
                map2.put(cha, map2.get(cha)+1);
            }
            else {
                map2.put(t.substring(i,i+1), 1);
            }
        }

        if (map1.equals(map2)){
            return true;
        }
        return false; 

    }
}
