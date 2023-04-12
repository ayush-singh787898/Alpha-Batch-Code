// Activity Selection:- The activity selection problem is a combinatorial optimization problem concerning the selection of 
//non-conflicting activities to perform within a given time frame, given a set of activities each marked by a start time and end time.


// Steps to solve Activity Selection Problem
//  Step 1: Sort the given activities in ascending order according to their finishing time.
// Step 2: Select the first activity from 
//sorted array act[] and add it to sol[] array.
// Step 3: Repeat steps 4 and 5 for the remaining activities in act[] .


import java.util.*;
public class L01_ActivitySelection {
    public static void main(String[] args) {    // Time complexity to solve problem is O(n).
        int start[]={1,3,0,5,8,5};
        int end[]=  {2,4,6,7,9,9};   // already sorted end array according to activity and time.
        int maxActivity=0;
        ArrayList<Integer>ans=new ArrayList<>();    // In this arrayList we will store index of activity.
        // 1st activity
        maxActivity=1;      // initial maximum activity performed=1
        ans.add(0);     // 1st activity is stored in ans , 0 is added in ans.
        int lastEnd=end[0];     // end time of last activity chosen (or first end time is stored in lastEnd )
        for(int i=1;i<end.length;i++){
            // Non-Overlapping condition(Disjoint condition):-start time>=last chosen activity end time
            if(start[i]>=lastEnd){
                // activity select steps
                maxActivity++;
                ans.add(i);     // index is stored in ans
                lastEnd=end[i];
            }
        }
        System.out.println("max activity = "+maxActivity);
        // activities are printing
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");

        }
        System.out.println();
    }
    
}
