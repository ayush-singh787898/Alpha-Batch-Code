import java.util.Scanner;
public class PascalTriangle {
    public static int fun(int i,int j){
        return (fact(i)/(fact(i-j)*fact(j)));
    }
    public static int fact(int a){
        int fac=1;
        for(int i=1;i<=a;i++){
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(fun(i,j)+" ");
            }
            System.out.println();
        }
    }   
}
