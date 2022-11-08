// Kth smallest element in ascending order.
import java.util.Scanner;
public class Kth_Smallest_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be search");
        int k=sc.nextInt();
        int temp;
        int a[]={2,5,6,8,4,3};
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }

            }
        }
        System.out.println(k+" is present at index:");
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                System.out.print(i+" ");


            }
        }
    }
    


    
}
