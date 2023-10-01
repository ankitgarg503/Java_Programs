
class Circle{
    public double radius;
    public double area;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void calculateArea(){
        this.area = 3.14*radius*radius;
    }
    public void display(){
        System.out.println("Area of Circle having Radius = " + this.radius+"  is = "+ area  );
    }
    public double getArea(){
        return area;
    }
}

class Cylinder extends Circle{
    public double height;
    public void setHeight(double height) {
        this.height = height;
    }
    public void displayHeight(){
        System.out.println("Height="+height);
    }
     public void calculateArea(){
         super.calculateArea();
         double areaOfCircle=super.getArea();
         double totalArea=2*areaOfCircle +2*3.14*height;
         System.out.println("Area of Cylinder: " + totalArea);
     }
     public void calculateVolume(){
         double areaT=super.getArea();
         double volume=this.height*areaT;
         System.out.println("Volume of Cylinder: " + volume);
     }
}
class Rectangle{
    public Rectangle(){
        System.out.println("I am a Rectangle Constructur");
    }
    public double length;
    public double breadth;
    // public double height;
    public double area;
    public void setDimensions(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
        // this.height = height;
    }
    public void calculateArea(){
        this.area = length*breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    public void display(){
        System.out.println("Area of Rectangle = " + area);
    }
    public double getArea(){
        return area;
    }
}

class Cuboid extends Rectangle{
    public Cuboid(){
        System.out.println("I am a Cuboid Constructor"); 
    }
    public double height;
    public void setHeight(double height) {
        this.height = height;
    }
     public void calculateArea(){
         super.calculateArea();
         double areaOfCircle=super.getArea();
         double totalArea=2*(areaOfCircle+(super.length*this.height)+(super.breadth*this.height));
         System.out.println("Area of Cuboid: " + totalArea);
     }
     public void calculateVolume(){
           double areaT=super.getArea();
           double volume=areaT*this.height;
           System.out.println("Volume of Cuboid : " + volume);
     }
     public void displayHeight(){
        System.out.println("Height of Cuboid "+height);
     }
     public void baseArea(){
        super.calculateArea();
     }

}
class Room extends Cuboid{
    public Room(){
        System.out.println("I am room Constructor");
    }
}

public class inher_prac {
  public static void main(String[] args) {
    System.out.println("Inheritance Practice Question with Solutions");
    Circle c1=new Circle();
     c1.setRadius(4);
     c1.calculateArea();
    c1.display();

    Cylinder c2=new Cylinder();
    c2.setRadius(4);
    c2.setHeight(5);
    c2.displayHeight();
    c2.calculateArea();
    c2.calculateVolume();


    // Rectangle r1=new Rectangle();
    // r1.setDimensions(10,5 );
    // r1.calculateArea();
    // r1.display();
  
   Cuboid c5=new Cuboid();
   c5.height=8;
   c5.length=10;
   c5.breadth=15;
   c5.baseArea();
  c5.displayHeight();
   c5.calculateArea();
   c5.calculateVolume(); 

   Room r1=new Room();


  }    
}
