// NUMBER ELEMENTS SORTING USING SelectionSort

// public class SelectionSort {
//     public static void main(String[] args) {
//         int n[]={1,2,5,6,8,23};
//         int temp;
//         int min;
//         for(int i=0;i<n.length;i++){
//             min=i;
//             for(int j=i+1;j<n.length;j++){
//                 if(n[min]>n[j]){
//                     temp=n[min];
//                     n[min]=n[j];
//                     n[j]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<n.length;i++){
//             System.out.print(n[i]+" ");
//         }
      
//     }
// }

// STRING ELEMENTS SORTING USING SelectionSort
public class SelectionSort {
    public static void main(String[] args) {
        String n[]={"hello","ayush","how"};
        String temp=" ";
        int min;
        for(int i=0;i<n.length;i++){
            min=i;
            for(int j=i+1;j<n.length;j++){
                // if(n[min]>n[j]){
                    if(n[min].compareTo(n[j])<0){
                        min=j;
                    }
                    temp=n[min];
                    n[min]=n[j];
                    n[j]=temp;
                
            }
        }
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
      
    }
}
