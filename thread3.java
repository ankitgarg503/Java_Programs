import java.util.*;

class A extends Thread{
    public void run(){
        int i=0;
          try{
                Thread.sleep(20);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
        while(true){
            // System.out.println("Good Morning!");
            i++;
            if(i==2656){
                break;
            }
        }
    }
}
class B extends Thread{
         public void run(){
                int i=0;
            while(true){
                // System.out.println("Welcomes You!");
                i++;
                try{
                Thread.sleep(2);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }


                if(i==2656){
                    break;
                }
            }
    }
       
}




public class thread3{
    public static void main(String[] args) {
        System.out.println("Answer 1");
        A a1=new A();
        B b1=new B();
        a1.start();
        b1.start();
        // a1.setPriority(3);
        // b1.setPriority(6);
        System.out.println(a1.getState());
        System.out.println(b1.getState());
        System.out.println(a1.getPriority());
        System.out.println(b1.getPriority());
    }
}