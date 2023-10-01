import java.util.*;
public class arrayList {
   public static void main(String[] args) {
    ArrayList<Integer> l1=new ArrayList<Integer>();
    ArrayList<String> l2=new ArrayList<String>();
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l2.add("Ankit");
        l2.add("Nitya");
        l2.add("Tmna");
        // l2.clear();
        l2.add("Sahana");
        l2.add(1,"Priyanka");
        // l1.clear();
        l1.add(1,55);
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");
        }
       System.out.println(l1.indexOf(12));
       System.out.println(l1.indexOf(14));
       System.out.println(l1.indexOf(19));
       System.out.println(l1.contains(55));
       System.out.println();
       Iterator it=l2.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
    }
    System.out.println(l2.size());
    System.out.println(l2.isEmpty());


   }    
}
