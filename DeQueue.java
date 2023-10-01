



import java.util.*;

public class DeQueue {

   public static void main(String[] args) {
    ArrayDeque<Integer> l1=new ArrayDeque<Integer>();
        l1.add(12);
        l1.add(13);
        l1.add(14);
       
        // l1.clear();
        l1.addLast(34);
        l1.addFirst(324);
      System.out.println(l1.getFirst());
      System.out.println(l1.getLast());

   }    
}
