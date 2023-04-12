import java.util.*;;
public class L03_Fractional_Knapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        // create 2-D array to sort ratio
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;          //0th column :- index is stored
            ratio[i][1]=val[i]/(double)weight[i];   // 1st coloumn :- ratio is stored

        }
        // 2-D array sorting in ascending order 
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=w;     // whole bag is empty 
        int finalValue=0;
        // descending order sorting: apply reverse loop
        for(int i=ratio.length-1;i>=0;i--){
            int indx=(int)ratio[i][0];
            if(capacity>=weight[indx]){         // include full item
                finalValue+=val[indx];
                capacity-=weight[indx];
            }
            else{
                //  include fractional item
                finalValue+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }

        }
        System.out.println("final value is : "+finalValue);
        
    }
    
}
