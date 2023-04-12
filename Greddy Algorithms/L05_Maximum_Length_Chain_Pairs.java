import java.util.*;
public class L05_Maximum_Length_Chain_Pairs {
    public static void main(String[] args) {
        //  Time complexity to solve this problem is O(nlogn)
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        // sort 2-D arrays
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1])); // sorting on basis of 1st colomns(2nd number)
        int chainLength=1;
        int chainEnd=pairs[0][1];       // last selected pair end (or chain end)
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){   // pairs[i][0] means start 
                chainLength++;
                chainEnd=pairs[i][1];
            }
        }
        System.out.println("max length of chain is = "+chainLength);
    }
    
}
