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
            fin.add(str.substring(i+1, i+1+len));
            
            i = i + 1 + len;
            myNum = "";
        }

        return fin;

    }
}

/**
What we learned: 
When we are coding strings it is easiest to skip over strings and instead say that we know the length of that string and we will take that subset. This avoids any issues with characters of strinbg conflicting with seperators 

When dealing with numbers and strings, most numbers are not single digits so we have to have a stopper or indicator for when the number is finished and the actual string starts (for example a character that comes immediatly after number to say number is over)

Lastly we can convert a string into a number with Integer.parseInt(stringName)
**/
