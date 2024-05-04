


class Employee{
    public int a=5;
    public void area(int a,int b){
        System.out.println("a="+a +"  "+"b="+b);
    }
}
class Junior extends Employee{
    public void volume(int a,int b){
        System.out.println("a="+a +"  "+"b="+b);
        System.out.println(super.a);
    }
}


public class demo {
    public static void main(String[] args){
        System.out.println("Demo Example");
        Employee employee = new Employee();
        employee.area(2, 5);
        Junior j1=new Junior();
        j1.volume(2, 5);
        j1.area(3, 5);
       
    }
}
