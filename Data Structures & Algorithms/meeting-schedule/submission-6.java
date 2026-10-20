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
        Collections.sort(intervals, (a,b) -> a.start - b.start); // negative a goes first so a smaller then b a goes first

        // cases 
        // meeting start before meeting ends 

        for (int i = 1; i < intervals.size(); i++){
            Interval val2 = intervals.get(i); 
            Interval val1 = intervals.get(i - 1); 

            if (val2.start < val1.end){ // event starts before other event 
                return false; 
            }
        }

        return true; 
    }
}
