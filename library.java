import java.util.*;


class OnlineLibrary{
    static String arr[]={"C","C++","Java","Python","JavaScript","PHP"};
     public static int count=6;
     public static int availale=6;
     public static int issue=0;
     public  void issueBook(){
        System.out.println("Your issue book="+arr[issue]);
        issue++;
     }
     public void availaleBook(){
        System.out.println("Total Book Available ="+(availale-issue));
        for(int i=issue;i<6;i++){
            System.out.println(arr[i]);
        }
     }
     

}



public class library {
    public static void main(String[] args) {
        System.out.println("Online library System");
        OnlineLibrary aksita=new OnlineLibrary();
        aksita.issueBook();
        aksita.issueBook();
        aksita.availaleBook();
    }
}
