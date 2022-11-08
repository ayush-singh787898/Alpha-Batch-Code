import javax.sound.sampled.SourceDataLine;

// import javax.sound.midi.Soundbank;
// import javax.sound.sampled.SourceDataLine;

// // import javax.swing.ProgressMonitor;
// public class practice {
//     public void run(){
//         System.out.println("dog is running fast");
//     }
//     public static void main(String[] args) {
//         System.out.println("hello");
//         practice dog=new practice();
//         dog.run();
//         dog.play();
//         birds sp=new birds();
//         sp.fly();
//         human manoj=new human();
//         manoj.singing();
//     }
//     public void play(){
//         System.out.println("dog is playing");
//     }
   
    
// }
// class birds{
//     public void fly(){
//         System.out.println("Birds are flying");
//     }
// }
// class human{
//     public void singing(){
//         System.out.println("Manoj is singing");

//     }
// }




// method initialization using reference variable.


// class practice{
//     String color;
//     int age;
//     long mob;
    
//     public static void main(String[] args) {
//         practice p=new practice();
//         p.color="gray";
//         p.age=25;
//         p.mob=487848425;
//         // p.mob=256816895693;
//         System.out.println("color: "+p.color+" , "+ "age: "+p.age+"mob:");
//         System.out.println("mobile number is:"+p.mob);
//     }
// }


// method initialization using method.

// class practice{
//     String color;
//     int age;
//     void abc(String c,int a){  
//         color=c;
//         age=a;
//     }
//     void display(){
//         System.out.println("color is: "+color+" age is:"+age);
//     }
//     public static void main(String[] args) {
//         practice p=new practice();
//         p.abc("White",19);
//         p.display();
//     }
// }


// method initialization using constructor.

// class practice{
//     String name;
//     int emp_id;
//     practice(String name,int emp_id){
//         this.name=name;
//         this.emp_id=emp_id;
//     }

//     public static void main(String[] args) {
//         practice e1=new practice("ayush",419);
//         practice e2=new practice("abhi",129);
//         System.out.println(e1.name+" "+e1.emp_id);
//         System.out.println(e2.name+" "+e2.emp_id);
//     }

// }


// public class practice{
//     int j;;
//     int i=10;
//     String st;
//     String s="hello";
//     public static void main(String[] args) {
//         practice p=new practice();
//         System.out.println(p.j);
//         System.out.println(p.i);
//         System.out.println(p.st);
//         System.out.println(p.s);
//     }
// }



// public class practice {
//     practice(){
//         System.out.println("no argument");
//     }
//     public static void main(String[] args) {
//         practice p=new practice();
//         System.out.println("prove it");      
//     }
// }


// public class practice{
//     practice(int a,String s){
//         System.out.println(a+"\n"+s); 

//     }
//     public static void main(String[] args){
//         practice p=new practice(10, "hello");
//     }
// }



// public class practice{
//     public void hw() {
//         System.out.println("Hello world");   
//     }
//     public static void main(String[] args) {
//         practice p=new practice();
//         p.hw();
//         p.eat();
//     }
//     public void eat(){
//         System.out.println("I am eating");

//     }
//     // return eat(a)
// }



// public class practice{
//     void eat(){
//         System.out.println("Sonu is eating");
//     }
// }
//     class man extends practice{
//         public static void main(String[] args) {
//         man m=new man();
//         m.eat();
//         }
//     }

public class practice{
    void showpractice(){
        System.out.println("hello");
    }
}
    class p2 extends practice{
        void showp2(){
            System.out.println("how are you");
        }
    
    public static void main(String[] args) {
        practice p=new practice();
        p.showpractice();
        // p.showp2();
        p2 obj2=new p2();
        // obj2.showp2();
        obj2.showpractice();
    }
}
