
class Employee{
    int eid;
    String name;
    float salary;
    public void printEmployeeDetails(){
         System.out.println("Id of Employee="+eid);
         System.out.println(" Employee name="+name);
         System.out.println(" Salary of "+name+" :"+salary);
    } 

}



public class customclass {
    public static void main(String args[]){
        System.out.println("Custom class");


        Employee ankit=new Employee();
        ankit.eid=1009;
        ankit.name="Ankit Garg";
        ankit.salary=300000.0f;
        ankit.printEmployeeDetails();
        Employee nitya=new Employee();
        ankit.eid=1023;
        ankit.name="Nitya Garg";
        ankit.salary=30000.0f;
        System.out.println();
        ankit.printEmployeeDetails();
    }
   


}
