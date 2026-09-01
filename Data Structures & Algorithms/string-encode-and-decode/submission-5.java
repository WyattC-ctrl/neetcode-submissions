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

        System.out.println(str);
        // tell me the length then how many characters to iterate over 

        // iterate through the string and every time hit -- add the word to list 

        char[] arr = str.toCharArray();

        List<String> fin = new ArrayList<>();

        String currStr = "";
        int hyphCount = 0;

        int index  = 0;

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




        // for (char cha : arr){

        //     index++;

        //     if (cha == '0' && index != 2){
        //         fin.add("");
        //     }

        //     if (cha == '-'){
        //         hyphCount++; 
        //         if (hyphCount >= 2){
        //             currStr = currStr.substring(0, currStr.length() - 2);
        //             if (currStr.length() != 0){
        //                 fin.add(currStr);   
        //             }
        //             currStr = "";
        //             hyphCount = 0;
        //         }
        //         else {
        //             currStr = currStr + cha;
        //         }
        //     }
        //     else {
        //         currStr = currStr + cha;
        //     }

        // }
        return fin;

    }
}
