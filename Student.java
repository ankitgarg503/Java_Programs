import java.util.*;
class Student{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Four Numbers");
       int a,b,c,d;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       d=sc.nextInt();
       if(a<b && a<c && a<d){
        if(b<c && b<d){
          System.out.println(" 2nd Smallest no="+b);
        }
        else if(c<d && c<b){
          System.out.println(" 2nd Smallest no="+c);
        }
        else{
          System.out.println(" 2nd Smallest no="+d);
        }

       }
       if(b<a && b<c && b<d){
        if(a<c && a<d){
          System.out.println(" 2nd Smallest no="+a);
        }
        else if(c<d && c<a){
          System.out.println(" 2nd Smallest no="+c);
        }
        else{
          System.out.println(" 2nd Smallest no="+d);
        }

       }
       if(c<b && c<a && c<d){
         if(b<a && b<d){
          System.out.println(" 2nd Smallest no="+b);
        }
        else if(a<d && a<b){
          System.out.println(" 2nd Smallest no="+a);
        }
        else{
          System.out.println(" 2nd Smallest no="+d);
        }

       }
       if(d<b && d<a && d<c){
         if(b<a && b<c){
          System.out.println(" 2nd Smallest no="+b);
        }
        else if(a<c && a<b){
          System.out.println(" 2nd Smallest no="+a);
        }
        else{
          System.out.println(" 2nd Smallest no="+c);
        }

       }
       
       

       System.out.println("HII");
    }
}