// Dynamic Memory Dispatch
// We can make referce variable of base class and object of child class\
// But We can't make referce variable of child class and object of base class
//Run time Polymorphism


class Car{
   public void carName(){
      System.out.println("Car name is Santro");
   }
   public void fuelCapacity(){
    System.out.println("Fuel Capacity=20L");
   }
}
class SportsCar extends Car{
     public void carName(){
         System.out.println("Name of car =Ferrari");
     }
    public void speedOfCar(){
        System.out.println("Speed of Car=200KM/hour");
    }
}


public class Run_time {
   public static void main(String[] args) {
        // Car santro=new Car();
        // santro.carName();
        // SportsCar ferrari=new SportsCar();
        // ferrari.carName();
        Car ferrari=new SportsCar();
        ferrari.carName();
        // ferrari.speedOfCar();
        ferrari.fuelCapacity();
    }
}
