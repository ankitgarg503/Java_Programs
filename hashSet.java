import java.util.*;
public class hashSet {

   public static void main(String[] args) {
    HashSet<Integer> l1=new HashSet<Integer>();
        l1.add(12);
        l1.add(13);
        l1.add(13);
        l1.add(14);
        // l1.clear();
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println(System.currentTimeMillis()/1000/3600/24/366);
        System.out.println(System.currentTimeMillis()/1000/3600/24/366*12);

   }    
}

