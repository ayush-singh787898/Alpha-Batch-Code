import javax.sound.sampled.SourceDataLine;

public class DeletionDuplicateElements {
    public static void main(String[] args) {
        int a[]={1,1,3,4,5,5,6,7};
        // int[] temp=new int[a.length];
        int[] temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    // temp=a[i];
                  
                    // a[j]=temp;
                }
               
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

       
    }
}

