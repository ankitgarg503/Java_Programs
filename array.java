import java.util.*;
import java.util.Scanner;

public class array {
    public static void main(String args[]) {
          int arr[]={11,22,3,44,5,56,778,8};
          int index=Arrays.binarySearch(arr,22);
          Arrays.sort(arr);
        System.out.println(index);
            
          for(int item: arr){
            System.out.print(item+" ");
          }
          System.out.println();
          
        //   System.out.println(arr.length);
          for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                  int swap;
                  if(arr[i]<arr[j]){
                    swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                  }
            }
          }

          for(int item: arr){
            System.out.print(item+" ");
          }
          

    }
}
