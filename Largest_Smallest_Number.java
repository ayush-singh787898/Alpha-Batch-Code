import java.util.Scanner;
public class Largest_Smallest_Number {
    public static int Largest_Smallest_Number(int n[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(min>n[i]){
                min=n[i];
            }
            if(max<n[i]){
                max=n[i];
            }
        }
        System.out.println("largest element is:"+max);
        return min;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l[]={1,53,-5,10,0};
        int lsm=Largest_Smallest_Number(l);
        System.out.println("smallest element is:"+lsm);
    }
    
}
