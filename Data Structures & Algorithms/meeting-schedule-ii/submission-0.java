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
    public int minMeetingRooms(List<Interval> intervals) {
        // find the number of overlaps we have 

        // define what an overlap is 
        // when the start of one meeting is before the end of another meeting 
        // when consider and overlap we will have to consider the different rooms created and different times being stored 

        Collections.sort(intervals, (a,b) -> Integer.compare(a.start, b.start)); // O(nlogn) time 

        // how sort these such that time does not overlap, since have sorted based on start time we can use that and if time is found that does not fit in a room create a new room 
        // minimum number of meeting rooms, still based on start time, since soonest start time always comes first

        // only have to track endtime of last meeting 
        int[] rooms = new int[intervals.size()]; 
        int count = 0; 

        for (Interval meet: intervals){
            for (int i = 0; i < rooms.length; i++){
                if (rooms[i] <= meet.start){
                    if(rooms[i] == 0){
                        count++; // new room
                    }
                    rooms[i] = meet.end;
                    break;
                }
            }
        }

        return count; 


    }
}
