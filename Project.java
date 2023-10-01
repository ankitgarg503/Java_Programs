import java.util.*;


class Project{
      public static void main(String[] args){

        System.out.println("\n\n\n\t\t\t Welcome to the Project  Rock Paper Cesor");
    
        Random rd=new Random();
        System.out.println("\n\t\t \tROCK ---> 0 \t PAPER --->1  \t Cesor --->2 ");
        System.out.println("\n\t\t\tEnter -1 For The End of the Game");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name =sc.nextLine();
        
        

      while(true){
        int var1=rd.nextInt(3);
        System.out.println(name+"   Your Turn ");
        int var2=sc.nextInt();

        if((var1==0 && var2==0)  || (var1==1 && var2==1) ||(var1==2 && var2==2)){
            System.out.println("\t\tTHE GAME IS DRAW  "+'0');
            System.out.println("\t\tComputer Enters "+var1);
            System.out.println(" \t \t"+name+" Enters "+var2);
        }
        else if((var1==0 && var2==1)  || (var1==1 && var2==2 || (var2==0 && var1==2))){
             System.out.println("Congratulations! You won the Game");
             System.out.println("\t\tComputer Enters "+var1);
             System.out.println(" \t \t"+name+" Enters "+var2);
        }
        else{
            System.out.println("Sorry, but Lost  the  Game,Computer Wins");
            System.out.println("\t\tComputer Enters "+var1);
            System.out.println(" \t \t"+name+" Enters "+var2);
        }

      




        System.out.println("You Want to Quit the Game or Continue:  ");
        int var3=sc.nextInt();
        if(var3==-1){
            break;
        }
      }



        // int var2=sc.nextInt();
        // System.out.println("Enter one number");
        // System.out.println(var2);
        // int var1=rd.nextInt(3);
        // System.out.println(var1);
    } 
}
