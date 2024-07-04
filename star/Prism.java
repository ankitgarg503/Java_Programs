package star;

public class Prism {
    public void show(){
        for (int i = 0; i < 5; i++) {
             for (int j = 0; j < i; j++) {
                System.out.print("*" + "  ");
             }
             System.out.println();
        }
    }
}
