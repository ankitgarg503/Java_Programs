import java.util.Scanner;

public class practice {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float arr[];
        
        arr=new float[5];
         System.out.println("Enter Array Elemenst");

         for(int i=0;i<5;i++){
                //  System.out.println("Enter one number");
                    float element=sc.nextFloat();
                     arr[i]=element;
                     

                }
      System.out.println("Array Elemenets");
      float maxi=arr[0];
      float mini=arr[0];
      for(int i=0;i<5;i++){
        System.out.print(arr[i]+"  ");
      }

    int check=1;
    for(int i=0;i<4;i++){
        if(arr[i]>arr[i+1]){

            check=0;
        }
    }
    System.out.println();
    if(check==1){
        System.out.println("Array is in Sorted Order");
    }
    else{
        System.out.println("Array is not in Sorted Order");
    }

    //   for(int i=0;i<5;i++){
    //     if(maxi<arr[i]){
    //         maxi=arr[i];
    //     }
    //   }
    //   System.out.println();
    //   System.out.println("Maximum Element in the array="+maxi);


    //   for(int i=0;i<5;i++){
    //     if(mini>arr[i]){
    //         mini=arr[i];
    //     }
    //   }
    //   System.out.println();
    //   System.out.println("Minimum Element in the array="+mini);


    //   System.out.println("After Reversing the Array");
    //   for(int i=0;i<2;i++){
    //     float temp=arr[i];
    //     arr[i]=arr[5-i-1];
    //       arr[5-i-1]=temp;
    //   }

    //   for(int i=0;i<5;i++){
    //     System.out.print(arr[i]+"  ");
    //   }

    //     int mat1[][];
    //     mat1=new int[2][3];
    //     int mat2[][];
    //     mat2=new int[2][3];
    //     int sum[][];
    //     sum=new int[2][3];
    //     System.out.println("Enter Element for First Matrix:");
    //     for(int i=0;i<2;i++){
    //         for(int j=0;j<3;j++){
    //             int element=sc.nextInt();
    //             mat1[i][j]=element;
    //         }
    //     }
    //     System.out.println("Enter Element for Second Matrix:");
    //     for(int i=0;i<2;i++){
    //         for(int j=0;j<3;j++){
    //             int element=sc.nextInt();
    //             mat2[i][j]=element;
    //         }
    //     }
    //       System.out.println("Entered First Matrix given below:");
    //     for(int i=0;i<2;i++){
    //         for(int j=0;j<3;j++){
    //             //sum[i][j] = mat1[i][j]+mat2[i][j];
    //             System.out.print(mat1[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    //    System.out.println();
    //     System.out.println("Entered Second Matrix given below:");
    //     for(int i=0;i<2;i++){
    //         for(int j=0;j<3;j++){
    //             //sum[i][j] = mat1[i][j]+mat2[i][j];
    //             System.out.print(mat2[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();
    //     System.out.println("Sum of Two matrix given below:");
    //     for(int i=0;i<2;i++){
    //         for(int j=0;j<3;j++){
    //             sum[i][j] = mat1[i][j]+mat2[i][j];
    //             System.out.print(sum[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
        


    //     float sum=0;

    //     for(int i=0;i<5;i++){
    //        // System.out.println("Enter one number");
    //         float element=sc.nextFloat();
    //          arr[i]=element;
    //          sum=sum+arr[i];
    //     }
    //     System.out.println("Sum of Array Element="+sum);

    //     float num=sc.nextFloat();
    //     float avg=sum/5;
    //     System.out.println("Average of 5 subject marks="+avg);
    //     int s=0;
    //     for(int i=0;i<5;i++){
    //         if(arr[i]==num){
    //             s=1;
    //             //System.out.println("Elements is Present in the array");
    //     }
    // }
    //     if(s==1){
    //         System.out.println("Elements is Present in the array");
    //     }
    //     else{
    //         System.out.println("Elements is not Present in the array");
    //     }


     }
}
