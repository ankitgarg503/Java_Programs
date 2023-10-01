import java.util.Scanner;

public class func {

    public int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
             fact=fact*i;
        }
        return fact;
     }



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        func f1=new func();
          
        System.out.println("Enter a number : ");
        
        int x=sc.nextInt();
        int fact=f1.factorial(x);
        // int fact=factorial(x);
        System.out.println("Factorial of a number= "+fact);
    }
}
