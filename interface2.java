import javax.sound.sampled.SourceDataLine;

interface Car{
    public void carName();
    public float price=30;
    public void speedOfCar();
    private void tyreName(){
        System.out.println("MRF Tyres");
    }
     default public void color(){
        tyreName();
        System.out.println("The color of the car is white   ");
     }
}


class SportsCar implements Car{
     public void carName(){
        System.out.println("Santro is the name of Car");
     }
     public void speedOfCar(){
        System.out.println("90km/hr is the speed of the car");
     }
     public void priceOfCar(){
        System.out.println("Price of Car: " +price);
     }
}




public class interface2 {
    public static void main(String[] args) {
        System.out.println("Default method of interface");
        SportsCar s1=new SportsCar();
        s1.speedOfCar();
        s1.carName();
        s1.color();
        s1.priceOfCar();
    }
}
