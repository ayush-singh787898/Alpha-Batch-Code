public class alphabatch{
    // public static void main(String...args){  //CORRECT MAIN METHOD
    public static void main(String[]args){  // CORRECT MAIN METHOD
        // System.out.println("hello ");
        // int a[]=new int[50];
        // System.out.println(a); // address of 1-D array
        // System.out.println(a.length);

        int [] b;   //array declaration
        b=new int[3];  // array creation
        // b=new int[-3];  // array creation but show exception as NegativeArraySizeException.
        b[2]=6;
        System.out.println(b); // by default 0 is printed.
        System.out.println(b[1]); 
        System.out.println(b[2]); 
        // System.out.println(b[3]);  // ArrayIndexOutOFBoundException.
        int[]c=new int[100];  //array declaration and creation.
        String[] st;
        st=new String[3];
        System.out.println(st); //address of string.
        String[] s;
        s=new String[7];
        System.out.println(s.length);
        s[0]="hello";
        s[3]="bye";
        System.out.println(s[0]);
        System.out.println(s[1]); // by default null will print.
        System.out.println(s[3]);

        int[] arr={20,3,5,7};
        System.out.println(arr[0]);

        String[] sr={"ram","eats","mango"};
        System.out.println(sr[0]);
        System.out.println("String elements are as:");
        for(int i=0;i<sr.length;i++){
            System.out.println(sr[i]);
        }

    }
}
// import java.util.Scanner;
// class alphabatch{
//     public static void main(String[] args){
//     int marks[]=new int[100];
//     Scanner sc=new Scanner(System.in);

//     // LENGTH OF ARRAY CALCULATION
//     System.out.println("lengrh of array is:"+marks.length);

//     System.out.println("Enter marks");
//     marks[0]=sc.nextInt();
//     // marks[1]=sc.nextInt();
//     // marks[2]=sc.nextInt();
//     System.out.println("Marks of physics is:"+marks[0]);
//     // System.out.println("Marks of chemistry is:"+marks[1]);
//     // System.out.println("Marks of maths is:"+marks[2]);


//     // marks[2]=10;
//     // System.out.println("marks of maths:"+marks[2]);
//     marks[1]=marks[1]+1;
//     System.out.println("new marks of chemistry is:"+marks[1]);

//     // PERCENTAGE OF MARKS CALCULATION

//     // int percentage=(marks[0]+marks[1]+marks[2])/3;
//     // System.out.println("Total percentage of marks is:"+percentage+"%");

//     }
// }