import java.util.*;
class CBSEPER{
    public static void main(String[] args){
        // System.out.println("Enter 1 number");
         Scanner sc = new Scanner(System.in);
        // int num1=sc.nextInt();
        // System.out.println("Enter 2 number");
        // int num2=sc.nextInt();
        // int sum=num1+num2;
        // System.out.println("Sum of 2 number="+sum);
        System.out.println("Enter Your name");
        String name=sc.nextLine();
        
       // System.out.println(name);
        System.out.println("Enter Your Five Subject Marks");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();
        System.out.println("********  **********  ************  ********");
        int sum=sub1+sub2+sub3+sub4+sub5;
        float percentage=sc.nextFloat();
        percentage=(sum*100)/500;
        System.out.println(name+" Your Percentage ="+percentage);
    }
}