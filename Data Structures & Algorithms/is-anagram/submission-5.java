class Solution {
    public boolean isAnagram(String s, String t) {
        // trace how many times each character appears 
        //simplist way to do this is to create a map and with key value pairs being the num:number of  times appears
        //even simler way is iterate through the word and remove the characters from the other word

        String tmpS = s;
        String tmpT = t; 

        if (s.length() != t.length()){
            return false;
        }

        //for array you have to define the size initially
        //ArrayList is a better choice since Arrays dont resize they must dupklicate in order to
        HashMap<String, Integer> mapS = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            if (mapS.get(s.substring(i,i+1)) == null){
                mapS.put(s.substring(i,i+1), 1);
            }
            else{
                mapS.put(s.substring(i,i+1), mapS.get(s.substring(i,i+1)) + 1);

            }
        }

        for (int i = 0; i < t.length(); i++){
            if (mapS.get(t.substring(i, i+1)) == null){
                return false;
            }
            mapS.put(t.substring(i,i+1), mapS.get(t.substring(i,i+1)) - 1);
        }

        for (int i = 0; i < s.length(); i++){
            if (mapS.get(s.substring(i,i+1)) != 0){
                return false;
            }
        }

        return true;
    }
}
