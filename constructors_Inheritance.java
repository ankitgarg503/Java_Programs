class A{
    public A(){
        System.out.println("Base class Constructor");
    }
    public A(int x){
        System.out.println("Base Class parameterized constructor"+x);
    }
    void display(){
        System.out.println("Base Class Display");
    }
}
class B extends A{
    public B(){
        System.out.println("Derived class Constructor");
    }
    public B(int x){
        super(x);
        System.out.println("Derived class Constructor parameterized constructor "+x);
       
    }
}

class C extends B{
      public C(){
        super(0);
        System.out.println("C class Constructor");
      }
}


public class constructors_Inheritance {
    public static void main(String args[]) {
        System.out.println("Constructor in Inheritance");
        // A O1=new A(4536);
        //  B b1=new B(4243);
        // b1.display();
        C c1=new C();
      
        // c1.display();
    }
}
