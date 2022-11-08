// public class Transpose_of_matrix {
//     public static void main(String[] args) {
//         int a[][]={{1,2,3},
//         {4,5,6}};
//         trans(a);  
//     }
//     public static void trans(int [][]a){

//         int row=2,col=3;
//         int temp[][]=new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 temp[j][i]=a[i][j];
//                 System.out.println(temp[i][j]+" ");
//             }
     
//         }
//         // return temp;
//     }

    

    
// }

public class Transpose_of_matrix {
    public static void main(String[] args) {
        int a[][]={{1,2,6},
        {4,5,7}};
        int row=a.length,col=a[1].length;
        int temp[][]=new int[3][3];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                temp[j][i]=a[i][j];
            }     
        }  
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }  
    }
}

