interface p1{
  public  void face();
   public void fingers();

}
interface p2 extends p1{
  public  void eyes();
   public void spenis();
}
class Animals implements p1{
   public void face(){
    System.out.println("Very Beautiful Face you have");
   }
   public void fingers(){
    System.out.println("10 fingers you have");
   }
   public void eyes(){
    System.out.println("You have 2 beautiful eyes");
   }
   public void spenis(){
    System.out.println("Yes ,you have");
   }
}







public class interface_inheritance {
    public static void main(String[] args) {
        System.out.println("Interface inheritance");
        Animals anita = new Animals();
        anita.face();
        anita.eyes();
        anita.fingers();
        anita.spenis();
        
    }
}
