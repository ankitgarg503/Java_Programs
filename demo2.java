  class Base1{
    public void display(){
        System.out.println("We are in base class    ");
    }
}

/**
 * Innerdemo2
 */
 interface Innerdemo2 {

    abstract void hii();
}
 interface Innerdemo4 {

    abstract void hlo();
}


class Base2 extends Base1{
    public void show(){
        System.out.println("Good boy");
    }
    public void show(int a){
        System.out.println("Good news");
        
    }
    // (int a) -> System.out.println("a");
    @Override
     public void display(){
         System.out.println("We are in base2 class ");
        //  System.gc();
     }
}

class child extends Base2{
    public void greet(){
        System.out.println("Good Morning");
    }
}

class child2 implements Innerdemo2,Innerdemo4{
    public static int a=5;
    public static void display(){
        System.out.println("Ok");
    }
    public void hii(){
        System.out.println( "Nice");
    }
    public void hlo(){
        System.out.println("Nitya");
    }
}


public class demo2{
    public static void main(String[] args){
        System.out.println("Heelo");
        // Base1 n1=new Base1();
        // // n1.display();
        // child c1=new child();
        // c1.greet();
        // c1.display();
        // c1.show();
        Base2 b1=new Base2();
        b1.display();
        b1.show(2);
        child2 c2=new child2();
        c2.hii();
        c2.hlo();
        System.out.println(child2.a);
        child2.display();

    }
}