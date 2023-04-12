
// Activity Selection:- The activity selection problem is a combinatorial optimization problem concerning the selection of 
//non-conflicting activities to perform within a given time frame, given a set of activities each marked by a start time and end time.


// Steps to solve Activity Selection Problem
//  Step 1: Sort the given activities in ascending order according to their finishing time.
// Step 2: Select the first activity from 
//sorted array act[] and add it to sol[] array.
// Step 3: Repeat steps 4 and 5 for the remaining activities in act[] .


import java.util.*;
public class L02_ActivitySelection_EndTimeAlreadySorted {
    public static void main(String[] args) {    // Time complexity to solve problem is O(n).
        int start[]={1,3,0,5,8,5};
        int end[]=  {2,4,6,7,9,9,};   // already sorted end array according to activity and time.
        // Sorting 
        int activities[][]=new int[start.length][3];   // 3 means there are are three coloumns end,start and end. In each coloumn there are many rows (A0,A1,A2,A3,A4,A5) in these colomns
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        // Lambda function:- shortforms of big-function.
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));    // Sorting process of 2-D arrays.
        // Note: Comparator are the function that define how sorting occurs in a 2-D arrays.
        //  o[2] denotes that sorting will done according to coloumn-2 (i.e. end coloumn)
        // smaller ending time element will goes up side while larger ending time element will goes to down side.
        int maxActivity=0;
        ArrayList<Integer>ans=new ArrayList<>();    // In this arrayList we will store index of activity.
        // 1st activity
        maxActivity=1;      // initial maximum activity performed=1
        ans.add(activities[0][0]);    // 0th activity ka 0th index ans me add ho gya. Index is stored
        int lastEnd=activities[0][2];     // end time(activities[0][2]) is stored in last lastEnd. EndTime is stored
        for(int i=1;i<end.length;i++){
            // Non-Overlapping condition(Disjoint condition):-start time>=last chosen activity end time
            if(activities[i][1]>=lastEnd){      // start time is present in first index
                // activity select steps
                maxActivity++;
                ans.add(activities[i][0]);     // index is stored in ans.
                lastEnd=activities[i][2];       // ending time is stored in lastEnd.
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
