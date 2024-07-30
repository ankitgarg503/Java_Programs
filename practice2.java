import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashSet;

import java.util.HashMap;
class Demo{
    private int a=5;
    // public void display(){
    //     System.out.println("a="+a);
    //     ArrayList<String> a1=new ArrayList<String>();
    //     a1.add("Rohan");
    //     a1.add("Sohan");
    //     a1.add("Divya");
    //     a1.add("Emo");
    //     Collections.sort(a1);
    //     System.out.println(a1.get(1));
    //     a1.set(2,"Alexendra");
    //     System.out.println(a1);
    //     for (int i = 0; i <a1.size();i++){
    //         System.out.println(a1.get(i));
    //     }
    // }

    // public void display(){
    //     LinkedList<Integer> l1=new LinkedList<Integer>();
    //     l1.add(243);
    //     l1.add(34);
    //     l1.addFirst(263);
    //     Collections.sort(l1);
    //     for(Integer i1:l1){
    //         System.out.println(i1);
    //     }
    // }
    // public void display(){
    //     LinkedList<Integer> l1=new LinkedList<Integer>();
    //     HashMap<String,Integer> h1 = new HashMap<String,Integer>();
    //     h1.put("Nitya",23);
    //     h1.put("tammana",233);
    //     h1.put("Kavya",123);

    //     System.out.println(h1);
    //      for(String s1:h1.keySet()){
    //         System.out.println(s1);
    //      }
    //      for(Integer i1:h1.values()){
    //         System.out.println(i1);
    //      }
    // }
    public void display(){
        HashSet<Integer> h1 = new HashSet<Integer>();
        h1.add(23);
        h1.add(21);
        h1.add(23);
        h1.add(25);

        System.out.println(h1);
        for(Integer i1:h1){
              System.out.println("-->"+i1);
        }

    }
}


public class practice2 {
    public static void main(String[] args){
        System.out.println("Starting");
        Demo d1=new Demo();
        d1.display();
    }
}

