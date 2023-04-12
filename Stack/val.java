public class val {

    static void printa(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n+" ");
        printa(n-1);
        }
    }
    public static void main(String[] args) {
        printa(10);
    }
}
