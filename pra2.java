import java.util.Scanner;

public class pra2 {
    public static void main(String[] args){
        
        System.out.println("Enter a number ");
        // System.out.println("Enter Range of number from 1-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    //     int sum=0;
    //     int i=0;
    //     while(i<n){
    //         sum=sum+i;
    //         i=i+2;8

    //     }
    //   System.out.println("Sum of First "+n +" Even Natural no="+sum);
    // }

     int mult;
     int sum=0;
     for (int i = 10; i >=1;i--){
         mult=i*n;
         sum=sum+mult;
         System.out.println(n+" X "+i+" = "+mult);
     }
     System.out.println("Sum of Number Occuring in the table "+n+"="+sum);
    
    //   int fact=1;
    //   for(int i=1;i<=n;i++){
    //     fact=fact*i;
    //   }
    //   System.out.println("Factorial of a number "+fact);

}
}
