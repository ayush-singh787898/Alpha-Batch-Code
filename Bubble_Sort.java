// METHTOD-1: BUBBLE SORTING FOR NUMBERS :- ARRANGE THE ELEMENTS IN ASCENDING/DESCENDING ORDER OF SORTING.

// public class Bubble_Sort {
//     public static void main(String[] args){
//         int a[]={4,1,41,9,0,6};
//         int temp;
//         for(int i=0;i<a.length;i++){
                // for(int j=0;j<a.length-1;j++){
                    // if(a[j]>a[j+1]){   // FOR ASCENDING ORDER.
                //         //if(a[j]<a[j+1]){  // FOR DESCENDING ORDER.

//                     temp=a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//                 }
//             }
//         }
//         System.out.println("Sorted elements are as:");
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");

//         }
//     }
    
// }

// METHTOD-2: BUBBLE SORTING FOR NUMBERS.
// public class Bubble_Sort{
//     public static void main(String [] args){
//         int a[]={2,100,5,1,4,6,1,2,8};
//         int temp;
//         int flag=0;
//         System.out.println("length of array is:"+a.length);
//         for (int i=0;i<a.length;i++){
//                 for(int j=0;j<a.length-1-i;j++){
//                     // or:- for(int j=0;j<a.length-1-i;j++){  
//                 if(a[j]>a[j+1]){   // FOR ASCENDING ORDER.
//                 //if(a[j]<a[j+1]){   // FOR DESCENDING ORDER.

//                     temp=a[j+1];
//                     a[j+1]=a[j];
//                     a[j]=temp;
//                     flag=1;
//                 }
//             }
//             if (flag==0){
//                 break;
//             }
//         }
//         System.out.println("Sorted elements are:");
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");

//         }
//     }
// }

// BUBBLE SORT FOR STRING
// public class Bubble_Sort{
//     public static void main(String [] args){
//         String a[]={"ayush","akash","amit","ram"};
//         String temp;
//         int flag=0;
//         System.out.println("length of array is:"+a.length);
//         for (int i=0;i<a.length;i++){
//                 for(int j=0;j<a.length-1-i;j++){
//                     // or:- for(int j=0;j<a.length-1-i;j++){  
//                 if(a[j].compareTo(a[j+1])>0){   // FOR ASCENDING ORDER.
//                 //if(a[j]<a[j+1]){   // FOR DESCENDING ORDER. 
//                     temp=a[j+1];
//                     a[j+1]=a[j];
//                     a[j]=temp;
//                     flag=1;
//                 }
//             }
//             if (flag==0){
//                 break;
//             }
//         }
//         System.out.println("Sorted elements are:");
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");

//         }
//     }
// }



