import java.util.Arrays;

// import java.util.ArrayList;
// public class IntersectionProgram {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,4,5};
//         int b[]={2,4,2,6,9};
//         int temp;
//         System.out.println("hello");
//         ArrayList<Integer>list1=new ArrayList<>();
//         // int count=0;
//         int c[];
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<b.length;j++){
//                 if(a[i]==a[j]){
//                     list1=a[i];
//                     // count+=count;
                    

//                 }
//             }   
//         }
//         // int temp1[]=new int[count];

//         for(int i=0;i<list1.size();i++){
//             // System.out.println(temp1[i]);
//             System.out.println(list1.get(i));
//         }
//     }
    
// }


import java.util.*;
public class IntersectionProgram {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={2,4,6,9};
        int temp;
     
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    // temp=a[i];
                    // System.out.println(b[j]);                    
                    System.out.println(a[i]);                    
                    // System.out.println(Arrays.toString(temp));
                    // System.out.println(temp);
                }
            }   
        }
     
    }  
}
