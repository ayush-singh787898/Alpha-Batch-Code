import java.util.LinkedList;
public class L11_LinkedList_Collection_Faramework {
   public static void main(String[] args) {
     // Create
     LinkedList <Integer> ll=new LinkedList<>();
     //Add
     ll.addLast(1);
     ll.addLast(2);
     ll.addLast(3);
     ll.addFirst(0);
     ll.addFirst(null);
     System.out.println(ll);    //[null, 0, 1, 2, 3]
     // remove-operation
     ll.remove(0);
     ll.remove(ll.size()-1);
     System.out.println(ll);        //[null, 1, 2]
     System.out.println(ll.getFirst());
     System.out.println(ll.getLast());
   }

    
}
