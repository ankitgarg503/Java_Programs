import java.util.Scanner;

public class Assignment {


    public static void multiplicationTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" ="+n*i);
        }
    }
    public static void printStarPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int nthTermofFibonacciSeries(int n){
        if(n==0 || n==1){
            return 1;
        }
        return nthTermofFibonacciSeries(n-1)+nthTermofFibonacciSeries(n-2);
    }
  public static int argsSum(int ...arr){
    int sum = 0;
    for(int item : arr){
        sum=sum+item;
    }
    return sum;

  }
    public static int sumOfFirstNNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        
        return n+sumOfFirstNNaturalNumber(n-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int p=3;
        System.out.println("Hello, world!");
        // multiplicationTable(p);
         printStarPattern(p);
    //    int sum= sumOfFirstNNaturalNumber( p);
       //System.out.println("sum of N natural number="+sum);

      int s=nthTermofFibonacciSeries(p);
      System.out.println(p+"th term of fibonacci series="+s);
      int sum=argsSum(2,3,4,5,6,7,8,9,10);
      int avg=sum/9;
      System.out.println("Average: "+avg);

    }
}
