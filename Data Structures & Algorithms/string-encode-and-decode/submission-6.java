class Solution {

    public String encode(List<String> strs) {
        String master = "";

        for (String str : strs){
            // need # since strings may be length > 1
            master = master + str.length() + "#" + str; 
        }

        return master;

    }

    public List<String> decode(String str) {
        // tell me the length then how many characters to iterate over 

        // iterate through the string and every time hit -- add the word to list 
        List<String> fin = new ArrayList<>();

        int i = 0;

        String myNum = "";

        while (i < str.length()){
            // we know first character will always be a num
            while (!str.substring(i, i+1).equals("#")){
                myNum = myNum + str.substring(i, i+1);
                i++;
            }
    
            int len = Integer.parseInt(myNum);
            System.out.println(i + "" + len);
            System.out.println(str.substring(i+1, i+1+len) + "     " + i);
            //now we knwo length of word skip first character and add the otehrs 
            fin.add(str.substring(i+1, i+1+len));
            
            i = i + 1 + len;
            myNum = "";
        }

        return fin;

    }
}
