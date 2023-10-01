import java.util.*;
class string{
  public static void main(String[] args){
    System.out.println("String Functions");

     
     String str="Ninkit";
     System.out.println(str);
     Scanner sc = new Scanner(System.in);
     String st2 = sc.nextLine();
     System.out.println("st2: " + st2);
    //  for(int i=0; i<10;i++){
    //     System.out.println(st2);
    //  }
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.length());
    System.out.println(str.startsWith("Ni"));
    System.out.println(str.endsWith("kiit"));
    System.out.println(str.replace('n','a'));


  }
}