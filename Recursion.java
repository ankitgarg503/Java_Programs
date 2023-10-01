public class Recursion {

  static  int factorial(int n){
        if(n==0) return 1;
        else return n*factorial(n-1);
    }

    static int fibonacci(int n){
        if(n==1 || n==2) return 1;
        else return fibonacci(n-2)+fibonacci(n-1);
    }


    public static void main(String[] args){
        int n=10;
        System.out.println("Factorial of a number:"+factorial(n));
        System.out.println("Fibonacci nth term="+fibonacci(n));
    }
}
