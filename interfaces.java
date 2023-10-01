/*
 1) So Basically the main Differnce between abstrac classes and interface is 
    We can implement more then one interface in a class but abstract classes
    only extends 1 at a time and interface having only abstract methods where
    as abstract classes having abstract methods as well as some defined method
 */

abstract class Ab1{
 final   int price=12000;
    abstract public void switchOff();
    abstract public void reStart();
}

interface Ab2 {
  final  int a=567;
    public void name();
    public void camera();
}

class SmartPhone implements Ab2{
    public void switchOff(){
        System.out.println("Your phone is going to be switched off");
    }
    public void reStart(){
        System.out.println("Your phone is going to be re-started");
    }
    public void name(){
        System.out.println("Mobile name is OPPO F1S");
    }
    public void camera(){
        System.out.println("20 mpx front Camera and 16 Mpx back Camera");
    }
}




public class interfaces {
    public static void main(String[] args) {
        System.out.println("We are Going To implements interfaces");
        SmartPhone p1=new SmartPhone();
        p1.reStart();
        // p1.price=23;
        // System.out.println(p1.price);
        p1.name();
        // p1.a=45;
        System.out.println(p1.a);
    }
}
