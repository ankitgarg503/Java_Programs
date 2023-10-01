abstract  class Shape{
    // abstract public void perimeter();
    // abstract public void area();
    public void WhatsApp(){
        System.out.println("Nothing Special!");
    }
}

class Rectangle extends Shape{
    public int len,bre;
    Rectangle(int len,int bre){
          this.len=len;
          this.bre=bre;
    }
    public void perimeter(){
         System.out.println("Perimeter of rectangle "+2*(len+bre));
    }
    public void area(){
        System.out.println("Area of rectangle "+len*bre);
    }
}
abstract class MoreAbstract extends Shape{
    abstract public void volume(); 
}
public class Abstract {
    public static void main(String[] args) {
        System.out.println("Abstract Clasese and Methods"); 
        // Shape s=new Shape();
        Rectangle r1=new Rectangle(2,3);
        r1.WhatsApp();
        // MoreAbstract m1=new MoreAbstract();
        // Shape s1=new Shape();
        // s1.WhatsApp();
        r1.area();
        r1.perimeter();
    }
}
