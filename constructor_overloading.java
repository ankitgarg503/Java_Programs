
class Employee{
    private int id;
    private String name;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Employee(){
        System.out.println("We are Running  Constructor having no arguments");
    }
    public void printData(){
        System.out.println("Employee id: " +id);
        System.out.println("Employee name: " +name);
    }
}




public class constructor_overloading {
    public static void main(String[] args){
        System.out.println("Constructor OverLoading");
        Employee ankit=new Employee(1009,"Ankit");
        Employee ankit1=new Employee();
        ankit.printData();
    }
}
