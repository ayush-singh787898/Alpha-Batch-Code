public class InsertionSort {
    public static void main(String[] args){
        int []a={2,3,1,13,5,9};
        
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        System.out.println("Inserted elements are:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");


        }
    }
   
    
}
