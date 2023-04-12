import java.util.*;
public class L08_ChocolaProblem {
    public static void main(String[] args) {
        int n=4,m=6;
        // Note:-  if we have to solve the same problem for chessboard then replace n=8 and m=8 (b/c in chess-board there are total 64 pices).
        Integer costVertical[]={2,1,3,1,4};     // m-1
        Integer costHorizontal[]={4,1,2};       // n-1
        Arrays.sort(costVertical,Collections.reverseOrder());       // vertical cost is sorted in descending order
        Arrays.sort(costHorizontal,Collections.reverseOrder());     // horixontal cost is sorted in ascending order
        int h=0 ,v=0;   // h is horizontal cut while v is vertical cut.
        int hp=1, vp=1;     // hp is horizontal pieces and vp is vertical pieces.
        int cost=0;
        while(h<costHorizontal.length && v<costVertical.length){        // traverse until horizontal and vertical cut traversal complete.
            if(costVertical[v]<=costHorizontal[h]){                 // horizontal cut:-when horizontal cost is more.
                cost+=(costHorizontal[h]*vp);
                hp++;
                h++;
            }
            else{       
                cost+=(costVertical[v]*hp);         // vertical cut :- when vertical cost is more
                vp++;
                v++;
            }
        }
        // left horizontal cut which is not completed
        while(h<costHorizontal.length){
            cost+=(costHorizontal[h]*vp);
            hp++;
            h++;
        }
                // left vertical cut which is not completed
        while(v<costVertical.length){
            cost+=(costVertical[v]*hp);
            vp++;
            v++;
        }
        System.out.println("Min cost of cuts = "+cost);
    }

    
}
