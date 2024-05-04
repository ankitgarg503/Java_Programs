#include<iostream>
using namespace std;


class Car{
    public:
    void gearShift(void){
        cout<<" Change gera from 3 to 4";
    }
    void fuel(void){
        cout<<"\n 3 litre fuel left"<<endl;
    }

};
class RacingCar:public Car{
    public:
    void Radar(void){
        cout<<" ITaly is going to come "<<endl;
    }
    void fuel(void){
        cout<<" \n6 lotre fuel left"<<endl;
    }
};



int main(){
    Car c1;
    c1.gearShift();
    c1.fuel();
    RacingCar r1;
    r1.gearShift();
    r1.fuel();
    return 0;
}








// #include<iostream>
// using namespace std;


// class Employee{
 
//    int salary;
//    string name;
//    public:
//    static int a;
//    Employee(int n,string s){
//          name=s;
//           salary=n;
//             a++;
//    }
  
// //    void getName(string s){
 
   
// //    }
// //    void getSalary(int n){
   
// //    }
//    void display(void){
//     cout<<" Name of Employe= "<<name<<endl;
//     cout<<"Salary of Employee "<<salary<<endl;
//     cout<<a<<endl;
//    }
 
// };


// class JuniorEmployee : Employee{
//    public:
//    void display(int a){
//     cout<<" We are in Junior Employee class "<<a<<endl;
//    }
// };


//  int Employee::a=6;


// int main(){
//     Employee e(231000,"Ankit");
    
//     // e.getName("Ankit");
//     // e.getSalary(231000);
//     e.display();
//     Employee e2(21000,"Sohan");
//     // e2.getName("Sohan");
//     // e2.getSalary(21000);
//     e2.display();
//     JuniorEmployee e1;
//     e1.display();
//     return 0;
// }