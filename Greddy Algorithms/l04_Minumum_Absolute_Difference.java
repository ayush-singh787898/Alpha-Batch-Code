import java.util.*;
public class l04_Minumum_Absolute_Difference {
    // Timecomplexity=O(nlogn).
    public static void main(String[] args) {
        int A[]={1,2,3};
        int B[]={2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int minDifference=0;
        for(int i=0;i<A.length;i++){
          minDifference=Math.abs(A[i]-B[i]);

        }
        System.out.println("Minimum absolute difference of pairs = "+minDifference);

    }
    
}
