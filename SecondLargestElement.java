//      METHOD-1 TO CALCULATE SECOND LARGEST ELEMENT.
// public class SecondLargestElement {
//     public static void main(String[] args) {
//         int arr[]={1,3,2,4,5,7,9};
//         int l=arr.length;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]>arr[j]){
//                     arr[i]=arr[j];
//                 }
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         System.out.println("Second Largest element is:"+arr[l-2]);
//     }
// }

    // METHOD-2 TO CALCULATE SECOND LARGEST ELEMENT.

// public class SecondLargestElement {
//     public static void main(String[] args) {
//         int temp;
//         int arr[]={1,3,2,4,5,7,9};
//         int l=arr.length;
//         for(int i=0;i<l;i++){
//             for(int j=i+1;j<l;j++){
//                 if(arr[i]<arr[j]){
//                     temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
                
//             }

//         }
//         System.out.println("Array are:");
//         for(int i=0;i<l;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println("Largest second element is:"+arr[1]);

//     } 
// }

                // METHOD -3

// public class SecondLargestElement {
//     public static void main(String[] args) {
//         int temp;
//         int arr[]={1,3,1,2,4,3,5,7,9};
//         int l=arr.length;
//         for(int i=0;i<l;i++){
//             for(int j=i+1;j<l;j++){
//                 if(arr[i]<arr[j]){
//                     temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 } 
//             }
//             if(i==1){
//                 break;
//             }
//         }
//         System.out.println("Array are:");
//         for(int i=0;i<l;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println("second laragest element is:"+arr[1]);

//     } 
// }

                    // METHOD-4

public class SecondLargestElement{
    public static void main(String[] args) {
        int a[]={1,23,4,5,6,128,9,98};
        int largest_element=Integer.MIN_VALUE;
        int second_largest_element=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(largest_element<a[i]){
                second_largest_element=largest_element;
                largest_element=a[i];
                
            }
            else if (a[i]>second_largest_element && a[i]!=largest_element){
                second_largest_element=a[i];
            }
        }
        if(second_largest_element==Integer.MIN_VALUE){
            System.out.println("no any second largest element present in the list");
        }
        else{
            System.out.println("Second largest element is:"+second_largest_element);
        }

    }

}