import java.util.LinkedList;
import java.util.Stack;

class Parent extends Thread{
   @Override
   public void run() {
       // TODO Auto-generated method stub
       int i=20;
       while(i>0){
        System.out.println("Nitya Saini");
        i--;
       }
   }

}
class Child extends Thread{
   @Override
   public void run() {
       // TODO Auto-generated method stub
       int i=10;
       while(i>0){
        System.out.println("Ankit Garg");
        i--;
       }
   }

}





public class threading2 {
    public static void main(String[] args) {
        System.out.println("Threading");
        Parent p1=new Parent();
        Child c1=new Child();
        p1.start();
        c1.start();
        LinkedList<Integer> l1=new LinkedList<Integer>();
        Stack<Integer> s1=new Stack<Integer>();
        l1.add(22);
        l1.add(23);
        s1.add(22);
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        System.out.println(s1.size());

    }
}
