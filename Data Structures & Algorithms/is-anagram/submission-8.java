class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }
        
        char[] chaS = s.toCharArray();
        char[] chaT = t.toCharArray();

        Arrays.sort(chaS);
        Arrays.sort(chaT);

        if (!Arrays.equals(chaS, chaT)){
            return false;
        }

        return true;
    }
}

/**
/what did we learn from this 

Instanbtiate a HahsMap -- HashMap<Type1, Type2> name = new HashMap<>();

Hash map methods; get (returns null if key does not exist isnce value is null), 
put(craetes a key if a key does not exist)

The approach to iterate over a map multiple times is slow 

Arrays int[], char[], String[] all must use Arrays.method(varName) 
Maps, Sets, List can all use varName.method(). Since those specific classes Maps, Set and list have those methods defined where for array int[], char[], String[] does not have those methods defined in the class so you have to call from the array class. 

This is because 
**/

