class A implements Runnable{
  
     public  void run(){
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
            System.out.println("2 Interfaces");
       }
   
}

class B implements Runnable{
    public void run() {
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
        System.out.println("Interface 1");
    }
}


public class runnable_interface {
   public static void main(String[] args) {
    System.out.println("Runnable interface");
    A a1=new A();
    Thread aone=new Thread(a1);
    B b1=new B();
    Thread atwo=new Thread(b1);
    aone.start();
    atwo.start();
   } 
}
