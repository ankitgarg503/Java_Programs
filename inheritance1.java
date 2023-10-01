class Animal{
    public String name;
    public int legs;
    public boolean aquatic;
    public void setName(String name){
        this.name = name;
    
    }
    public void setProperties(int legs,boolean aquatic){
        this.legs = legs;
        this.aquatic=aquatic;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Leg="+legs);
        System.out.println("Aquatic or not: " + aquatic);

    }
    public void fun(){
        System.out.println("We are in base class");
    }
}

class Dogs extends Animal{
    public int teeths;
    public void setTeeths(int teeths) {
        this.teeths = teeths;
    }
    public void show(){
        System.out.println("teeths of Dog="+this.teeths);
    }
     public void fun(int a){
        System.out.println("We are in Derived class");
    }
}









public class inheritance1 {
    public static void main(String[] args) {
        System.out.println("Inheritance Starts");
        Animal animal1 = new Animal();
        Dogs dog1 =new Dogs();
        animal1.setName("Shampu");
        animal1.setProperties(4, false);
        // animal1.display();
    
        // dog1.setName("Shampu");
        // dog1.teeths=32;
        // dog1.setProperties(4, false);
        // dog1.display();
        // dog1.show();
        dog1.fun(6);
    }
}
