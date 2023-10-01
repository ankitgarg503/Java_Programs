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

public class inheritance_interface {
    public static void main(String[] args) {
        System.out.println("InterFace inheritance");
        SmartPhone s1=new SmartPhone();
        s1.callDuration();
        s1.faceLock();
        s1.mp3Player();
        System.out.println("a="+s1.a);
    }
}
