public class NQueen1{
    public static void NQueens(char board[][],int row) {

        // base case
        if(row==board.length){
            printBoard(board);
            return;
        }
        // coloumn loop
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            NQueens(board,row+1);
            board[row][j]='X';

        }
    }
    public static void printBoard(char board[][]){
        System.out.println("--------- chess Board");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        //initialze
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        NQueens(board,0);
    }
}