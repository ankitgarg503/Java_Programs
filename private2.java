class Employee{
   private int id;
   private String name;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
}





public class private2 {
    
    public static void main(String[] args) {

        System.out.println("USing Private members...");
         Employee ankit=new Employee();
        //  ankit.id=12;
        //  ankit.name="Ankit Garg";
        ankit.setId(12);
        ankit.setName("Ankit Garg");
         System.out.println(ankit.getId());
         System.out.println(ankit.getName());




    }
}
