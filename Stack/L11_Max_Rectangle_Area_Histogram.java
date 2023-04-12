import java.util.Stack;
public class L11_Max_Rectangle_Area_Histogram {
    public static void maxAreaHIstogram(int arr[]){     // O(n)
        int maxArea=0;
        int nsr[]=new int[arr.length];      // nsr: next smaller right
        int nsl[]=new int[arr.length];      // nsl:next smaller left
        // Next Smaller Right=O(n)
        Stack<Integer> s=new Stack();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        // Next smaller Left: O(n).
        s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;

            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        // Current Area: width=j-i-1=nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("max area in histogram=" +maxArea);

    }
    public static void main(String[] args) {
        // int arr[]={2,1,5,6,2,3};
        int arr[]={2,4};
        maxAreaHIstogram(arr);
        
    }
    
}
