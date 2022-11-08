// import java.util.Scanner;
// public class FactorialDivisibility {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number of element");
//         // int n=sc.nextInt();
//         int sum=0;
//         int n=6;
//         // int arr[]={3,2,2,2,3,3};
//         int arr[]={3,2,2,2,3,3};
//         int x=4;
//         int fact1=1;
//         int fact2=1;
//         int temp=0;
//         System.out.println("Enter the elemnts");
//         for(int i=0;i<arr.length;i++){
//             for(int j=1;j<=arr[i];j++){
//                 fact1=fact1*j;
//                 if(j==arr[i]){
//                     temp=fact1;
//                     fact1=1;
//                 }
//             }
//             sum+=temp;
//         }
//         System.out.println(sum);
//         for(int i=1;i<=x;i++){
//             fact2=fact2*i;
//         }
//         System.out.println(fact2);
//         if(sum % fact2==0){
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }
//     }  
// }







import java.util.Scanner;
public class FactorialDivisibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n=sc.nextInt();
        int sum=0;
        // int n=6;
        // int arr[]={3,2,2,2,3,3};
        // int arr[]={3,2,2,2,3,3};
        int arr[]=new int[n];
        int x=4;
        int fact1=1;
        int fact2=1;
        int temp=0;
        System.out.println("Enter the elemnts");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");

        }
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr[i];j++){
                fact1=fact1*j;
                if(j==arr[i]){
                    temp=fact1;
                    fact1=1;
                }
            }
            sum+=temp;
        }
        System.out.println(sum);
        for(int i=1;i<=x;i++){
            fact2=fact2*i;
        }
        System.out.println(fact2);
        if(sum % fact2==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }  
}
