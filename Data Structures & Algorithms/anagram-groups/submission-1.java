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
Contains key does not work for objects since objects are stored in memory
contains key works for primative types (char, boolean, String, int) so if 
you have a char[] you can turn it into a string String.valueOf(char[])

We also know that the left side of an instatiation equation contains the Static/compile time type. This type is what the compiler sees and is also returned for this object. this type is also where we can call methdos from. List is an interface that says these are the methods that we will have. 

The right hand side of the eqaution is the runtime type this defines how the methods are implmented for the specific type. You cant have a generic list on both sides or it wont know what to implement. The right side is called the runtime type. 

We use different types for compile time and runtime 

Left is what interface you use and right is what runtime type is. Its heklpful to keep them seperate since when we define parameters we want to keep the types generic in case the type ever changes. These methods can also vbe resused with different types if the parameters are generic types. 

**/
