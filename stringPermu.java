public class stringPermu{


   public static void solve(char arr[],int index,int size){

   
    // System.out.println();
         if(index>=size){     
            for(int i=0;i<=size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
         }

         for(int j=index;j<=size;j++){
             char temp = arr[index];
             arr[index]=arr[j];
             arr[j]=temp;
            
             solve(arr, index+1, size);
              temp = arr[index];
             arr[index]=arr[j];
             arr[j]=temp;

         }
   }


    public static void main(String[] args){
         char arr[]={'A','N','K','I','T'};
         int index=0;
         solve(arr,index,4);
    }
}
