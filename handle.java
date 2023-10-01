public class handle {
    public static void main(String[] args) {
        System.out.println("Handling Exceptions ");
        int a=3;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Congratulations End of program");
    }
}
