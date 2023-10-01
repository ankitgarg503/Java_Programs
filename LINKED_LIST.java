



import java.util.*;

public class LINKED_LIST {

   public static void main(String[] args) {
    LinkedList<Integer> l1=new LinkedList<Integer>();
    LinkedList<String> l2=new LinkedList<String>();
    l2.add("Ankit");
    l2.add("pawan mama");
    l2.add("anshu");
    l2.add("bhavesh");
        l1.add(12);
        l1.add(13);
        l1.add(14);
       
        // l1.clear();
        l1.add(1,55);
        l1.addLast(34);
        l1.addFirst(324);
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println(l1.indexOf(12));
        System.out.println(l1.indexOf(14));
        System.out.println(l1.indexOf(19));
        System.out.println(l1.contains(55));
        System.out.println();
        l2.removeLast();
        l2.removeFirst();
        for (int i=0; i<l2.size(); i++){
            System.out.print(l2.get(i)+" ");
        }

   }    
}
