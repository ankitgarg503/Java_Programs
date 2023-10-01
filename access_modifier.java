
 class A {
      public int p=5;
      private int p2=7;
      int p3=8;
      protected int p4=9;

    
}
class B extends A {
    public void display(){
        System.out.println(p);
        // System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}




public class access_modifier {
    public static void main(String[] args) {
        System.out.println("Usage of Access modifier");
        B b1=new B();
        b1.display();
    }    
}
