import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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

    public void display(){
        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(23);
        l1.add(34);
        l1.addFirst(263);
        for(Integer i1:l1){
            System.out.println(i1);
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

