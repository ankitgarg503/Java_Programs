class A extends Thread{
    @Override
    public void run(){
         int i=1; 
         while(true){
             System.out.println("Black Color ");
             i++;
             if (i==20) {
                break;
             }
    }
  }
}
class B extends Thread{
    @Override
    public void run(){
      int i=1;
        while(true){
            System.out.println("Yellow Sparkle ");
            i++;
            if(i==20){
                break;
            }
        }
    }
}

public class threading {
    public static void main(String[] args) {
        System.out.println("Threading Concept\n\n\n\n");
        A a1=new A();
        B b1=new B();
        a1.start();
        b1.start();
        System.out.println("Name of first thread:"+a1.getName());
    }
}
