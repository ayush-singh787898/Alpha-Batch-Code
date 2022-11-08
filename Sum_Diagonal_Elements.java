public class Sum_Diagonal_Elements {
    public static void main(String[] args) {
        int a [][]={{1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12},
                  {13,14,15,16}
                  };
    //    int s = sum_diagonal(a);
        System.out.println(sum_diagonal(a));
    }
    public static int sum_diagonal(int a [][]){
        int sum=0;
          int l=a.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j){
                    // System.out.print(a[i][j]+" ");
                    sum=sum+a[i][j];
                }
                else if(i+j==l-1){
                    sum=sum+a[i][j];
                    // System.out.println(a[i][j]);

                }
            }
        }
        // System.out.println("Sum of number is :"+sum);
        return sum;
    }   
}
