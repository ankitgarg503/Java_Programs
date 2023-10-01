import java.util.Scanner;

class Phone{
    public void callDuration(){
        System.out.println("Maximum call duration is"+" 60 minutes  ");
    }
}
interface Camera{
   public void pixel();
   
}
interface MP3{
    int a=9999;
    public void mp3Player();
}
class SmartPhone extends Phone implements MP3, Camera {
   public void faceLock(){
    System.out.println("Face lock facility available");
   }    
   public void pixel(){
    System.out.println("20 px from camera and 16 px rear camera");
   }
   public void mp3Player(){
    System.out.println("50 songs are available in this SmartPhone");
   }
}


public class polymorphism {
    public static void main(String[] args) {
        System.out.println("Testing polymorphism");
        Scanner sc=new Scanner(System.in);
        Camera c1=new SmartPhone();
        Phone p1=new SmartPhone();
        c1.pixel();
        // c1.faceLock();
        p1.callDuration();
        // p1.faceLock();
    }
}
