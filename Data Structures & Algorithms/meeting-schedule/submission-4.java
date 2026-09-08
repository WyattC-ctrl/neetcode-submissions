/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        // go through the list and add meetings depending on 
        // intervals is a list so use .get()

        // intervals are provided in any order 
        // sort the intervals 

        // have to do o(n^2) for now

        int prevStart = 0; 
        int prevEnd = 0;

        int j = 0; 


        for (Interval time : intervals){
            prevStart = time.start; 
            prevEnd = time.end; 
            j++; 

            for (int i = j; i < intervals.size(); i++){

                if (intervals.get(i).end > prevStart && intervals.get(i).start <= prevStart){
                    return false; 
                } else if (intervals.get(i).start >= prevStart && intervals.get(i).start < prevEnd){
                    return false; 
                }

            }

        }

        return true; 


    }
}
