class Car{
    private int a;
    public void fuelCapacity(int a){
        this.a = a;
    }
    public void displayCapacity(){
        System.out.println("Fuel capacity"+a);
    }
}
class SportsCar extends Car{
   public int y;
   public void speedOfCar(int a){
    this.y=a;
   }
   @Override
   public void fuelCapacity(int a){
    this.y=a;
   }
   public void displayCapacity(){
    System.out.println("Fuel Capacity of SportsCar: "+y);
   }

   public void displaySpeedOfCar(){
    System.out.println("Speed of car "+y);
   }
}


public class overriding {
    public static void main(String[] args){
        System.out.println("Method overriding");
        Car santro =new Car();
        santro.fuelCapacity(5);
        santro.displayCapacity();

        SportsCar farari=new SportsCar();
        farari.speedOfCar(80);
        farari.displaySpeedOfCar();
        farari.fuelCapacity(60);
        farari.displayCapacity();
    }
}
