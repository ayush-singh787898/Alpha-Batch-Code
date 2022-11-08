public class sum_of_2nd_row_elements {
    public static void sum(int a[][]){
        int s=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==1 && j>=0){
                    s=s+a[i][j];

                }
            }
        }
        System.out.println("Sum of second row elements are:"+s);
    }
    public static void main(String[] args) {
        int[][]a={{1,4,8},
                 {11,4,3},
                 {2,2,3}};
        sum(a);
    }
    
}
