class Solution {
    public boolean isPalindrome(String s) {

        // sicne plaindroms read the same forward and backward have a point in front and back
        // if palidrom is odd then stop when i = j
        // if palidrom is even then stop when i = j+1

        // make lowercase to avoid any errors
        // only consider alphabetical characters
        // start with cleaning the string 
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "");

        filtered = filtered.toLowerCase();
        // go through string backwards anbd forwards

        int j = filtered.length() - 1; 

        System.out.println(filtered);

        // the divison by 2 will work for even palidroms and for off for odd so add extra + 1
        // since j-- at end will work correctly for odd palidroms

        for (int i = 0; i < filtered.length() / 2; i++){
            if (!filtered.substring(i,i+1).equals(filtered.substring(j, j+1))){
                System.out.println(filtered.substring(i,i+1) + "    " + filtered.substring(j,j+1));
                return false; 
            }
            j--; 
        }

        return true; 

        
    }
}
