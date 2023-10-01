public class varargs {

  static int mul(int ...arr){
         int prod=1;
         for(int item :arr){
            prod *=item;
         }
          return prod;
         
  }

    public static void main(String[] args){
        System.out.println("Varargs Discussion");
        System.out.println(mul(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
    }
}
