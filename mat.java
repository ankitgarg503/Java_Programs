import java.util.*;


public class mat {
    public static void main(String[] args){
        int A[][];
        A = new int [3][3];
        int B[][];
        B = new int [3][3];
        int C[][];
        C = new int [3][3];
        System.out.println("Addition of 2 MAtrix");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Elements for First Matrix:");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                int element=sc.nextInt();
                A[i][j]=element;
            }
        }
        System.out.println("Enter Elements for Second Matrix:");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
                int element=sc.nextInt();
                B[i][j]=element;
            }
        }

        System.out.println("Entered  Matrix A  given Below:");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
               
                
                System.out.print(A[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Entered  Matrix B  given Below:");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
               
                
                System.out.print(B[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();

        System.out.println("Sum of 2 Matrix A and B given Below:");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++){
               
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();

        }




    }
}
