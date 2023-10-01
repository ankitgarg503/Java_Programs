import java.util.Scanner;
class Marry{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String name2;
      System.out.println("Enter Dulhan name: ");
      name2=sc.nextLine();
      System.out.println(name2+"  Enter a name");
      String name;
      name=sc.nextLine();
      switch(name) {
        case "Ankit":
        System.out.println(name2+" is going to marry with Ankit");
        break;
        case "Sohan":
        System.out.println(name2+" is going to marry with Sohan");
        break;
        case "Rohan":
        System.out.println(name2+" is going to marry with Rohan");
        break;
        case "Vishal":
        System.out.println(name2+" is going to marry with Vishal");
        break;
        default:
         System.out.println(name2+" is going to marry with Vicky");
      }


    }
}