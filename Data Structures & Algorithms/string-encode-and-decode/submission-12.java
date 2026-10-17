class Solution {

    public String encode(List<String> strs) {
        // return a string of all the strings together and break apart on some char
        
        String ans = ""; 

        for (String str : strs){
            int len = str.length(); 
            ans = ans + len + "-" + str; 
        }

        return ans; 

    }

    public List<String> decode(String str) {

        List<String> ans = new ArrayList<>(); 

        String cur = ""; 
        int curNum; 
        int dash; 
        String tmp = str; 


        while (tmp.length() > 1){
            dash = tmp.indexOf("-") + 1; 
            curNum = Integer.valueOf(tmp.substring(0, dash - 1)); 
            tmp = tmp.substring(dash); 
            ans.add(tmp.substring(0, curNum)); 
            tmp = tmp.substring(curNum); 
        }

        if (tmp.equals("0")){
            ans.add(""); 
        }


        return ans; 
    }
}
