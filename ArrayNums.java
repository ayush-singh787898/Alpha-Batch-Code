// // Given an integer array nums return true if any value appears at least twice in array
// // and return false if every elements is distinct.
// public class ArrayNums {
// public static void distinct(int[] n){
//     for(int i=0;i<n.length;i++){
//         for(int j=i+1;j<n.length;j++){
//             if(n[i]==n[j]){
//                 // return true;
//                 continue;
//                 // break;
//             }
//             else{
//                 System.out.print(n[i]+" ");
//             }

//         }

//     }
   

//     // return false;
// }
// public static void main(String[] args) {
//     // Scanner sc=new Scanner(System.in);
//     int a[]={1,2,4,1,4,5,7,8,6,2};
//     // System.out.println(distinct(a));
//     distinct(a);
// }

    
// }



// Given an integer array nums return true if any value appears at least twice in array
// and return false if every elements is distinct.
public class ArrayNums {
    public static int distinct(int[] n){
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]==n[j]){
                    return true;
                    continue;
                    // break;
                }
            }
    
        }
        return false;
    
    }
       
    
        // return false;
    
    public static void main(String[] args) {
        int a[]={1,2,4,1,4,5,7,8,6,2};
        // System.out.println(distinct(a));
        distinct(a);
    }
    
        
    }
    
