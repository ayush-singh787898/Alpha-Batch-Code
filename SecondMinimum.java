public class SecondMinimum {
    public static void main(String[] args) {
        int a[]={1,23,4,5,6,128,9,98};
        int smallest_element=Integer.MAX_VALUE;
        int second_smallest_element=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(smallest_element>a[i]){
                second_smallest_element=smallest_element;
                smallest_element=a[i];
                
            }
            else if (a[i]<second_smallest_element && a[i]!=smallest_element){
                second_smallest_element=a[i];
            }
        }
        if(second_smallest_element==Integer.MAX_VALUE){
            System.out.println("no any second  smallest elemenst  present in the list");
        }
        else{
            System.out.println("Second smallest element is:"+second_smallest_element);
        }

    }

}
    

