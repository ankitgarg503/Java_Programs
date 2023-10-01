import java.util.Scanner;

public class overloading {


    static void fun1(int []p){
      p[1]=6789;          
    }

    static void f1(int a){
        System.out.println("Only one parameter");
    }
    static void f1(){
        System.out.println("No parameter");
    }
    static void f1(int a,int b){
        System.out.println("Two parameter");
    }
    public static void main (String[] args){
        //call by refernece and call by value
        
        int a,b;
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter value of a=");
        int []arr={11,22,33,44,55,6};
        System.out.println("Before cAlling arr[1]="+arr[1]);
        fun1(arr);
        System.out.println("After cAlling arr[1]="+arr[1]);

        f1(3);
        f1(3,6);
        f1();
    //     a=sc.nextInt();
    //     System.out.println("Enter value of b=");
    //     b=sc.nextInt();
    //     fun1(a,b);
    //     System.out.println("a="+a);
    //     System.out.println("b="+b);
     }
}
