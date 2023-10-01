import java.util.Scanner;

public class binary_recusion {

    public static void print(int arr[],int low,int high,int key){
        System.out.println(high);
        for(int i=0;i<high;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static boolean binarySearch(int arr[],int low,int high,int key){
        print(arr,low,high,key);
        if(low>high){
            return false;
        }
        int mid=(low+high)/2;
        if(arr[mid]==key){
            return true;
        }
         if(arr[mid]>key){
            return binarySearch(arr, low, mid-1, key);
         }
         else{
            return binarySearch(arr,mid+1, high, key);
         }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Recusion");
        int arr[]={11,22,33,44,55,66,77,88,99,101,101,101,101,101,101,101};
        boolean p=binarySearch(arr,0,16,4);
        if(p){
            System.out.println("Element is present in the array");
        }
        else{
            System.out.println("Element is not present in the array");
        }
    }
}
