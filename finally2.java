


public class finally2 {

 public static void fin(){
     int a=2;
     int b=0;
     try{
        int c=a/b;
     }
     catch(Exception e){
        System.out.println(e);
        return ;
     }
     finally{
        System.out.println("After returning from the function I am Executing");
     }
 }






    public static void main(String[] args) {
        System.out.println("Program Running");
            fin();
    }
}
