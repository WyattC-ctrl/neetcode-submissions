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

//         if (s.length() != t.length()){
//             return false;
//         }

//         //for array you have to define the size initially
//         //ArrayList is a better choice since Arrays dont resize they must dupklicate in order to
//         HashMap<String, Integer> mapS = new HashMap<>();

//         for (int i = 0; i < s.length(); i++){
//             if (mapS.get(s.substring(i,i+1)) == null){
//                 mapS.put(s.substring(i,i+1), 1);
//             }
//             else{
//                 mapS.put(s.substring(i,i+1), mapS.get(s.substring(i,i+1)) + 1);

//             }
//         }

//         for (int i = 0; i < t.length(); i++){
//             if (mapS.get(t.substring(i, i+1)) == null){
//                 return false;
//             }
//             mapS.put(t.substring(i,i+1), mapS.get(t.substring(i,i+1)) - 1);
//         }

//         for (int i = 0; i < s.length(); i++){
//             if (mapS.get(s.substring(i,i+1)) != 0){
//                 return false;
//             }
//         }

//         return true;
//     }
// }

/**
/what did we learn from this 

Instanbtiate a HahsMap -- HashMap<Type1, Type2> name = new HashMap<>();

Hash map methods; get (returns null if key does not exist isnce value is null), 
put(craetes a key if a key does not exist)

The approach to iterate over a map multiple times is slow 
**/

