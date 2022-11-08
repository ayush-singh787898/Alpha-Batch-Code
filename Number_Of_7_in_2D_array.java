// public class Number_Of_7_in_2D_array {
//     public static void main(String[] args) {
//         int a[][]={{4,7,8},{8,8,7}};
//         int l=0;
//         // System.out.println(a.length);
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<=a.length;j++){
//                 if(a[i][j]==7){
//                     l=l+1;
//                 }
//                 System.out.print(a[i][j]+" ");
//             }
//         }
//         System.out.println();
//         System.out.println("7 is present in array at"+l+" times");
//     }
    
// }

public class Number_Of_7_in_2D_array {
    public static void sum(int[][] a){
        int l=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<=a.length;j++){
                if(a[i][j]==7){
                    l=l+1;
                }
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("7 is present in array at "+l+" times");

    }
    public static void main(String[] args) {
        int a[][]={{4,7,8},{8,8,7}};
        // System.out.println(a.length);
        sum(a);
     
        // System.out.println();
    }
    
}

