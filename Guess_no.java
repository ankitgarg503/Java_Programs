import java.util.Scanner;

class Test {
    public int noOfGuesses;
    public int num=0;
    public int lose=0;

    Test(int m) {
        num = m;
    }

    public void startGuess() {
        System.out.println("Enter Your Guess");
        Scanner sc = new Scanner(System.in);
        while (true) {
            lose++;
            if(lose==10){
                System.out.println();
                System.out.println("Sorry,You Loose the Game!");
                break;
            }
            int user_input = sc.nextInt();
            if (user_input == num) {
                         System.out.println();
                        System.out.println("Congratulations Your guess is Correct!");
                        System.out.println("Your Total Guess: " + noOfGuesses);
                        break;
            } 
            else if (user_input < 10) {
                    System.out.println("You are far away from Corrct Input Incrase Your Input ");
                    noOfGuesses++;
            } 
            else if (user_input >= 10 && user_input < 30) {
                    System.out.println("You are in the right way Increase Your Input");
                    noOfGuesses++;
            } 
            else if (user_input >= 30 && user_input < 45) {
                    System.out.println("You are nearBY the correct anser just increase your input");
                    noOfGuesses++;
            } 
            else if (user_input >= 45 && user_input < 52) {
                    System.out.println("You are very close to correct Guess just slightly increase your input");
                    noOfGuesses++;
            } 
            else if (user_input >= 70) {
                    System.out.println("You are far away from Corrct Input Decrase Your Input");
                    noOfGuesses++;
            } 
            else if (user_input >= 60 && user_input < 70) {
                    System.out.println("You are nearBY the correct anser just decrease your input");
                    noOfGuesses++;
            } 
            else if (user_input > 52 && user_input < 60) {
                    System.out.println("You are very close to correct Guess just slightly decrease your input");
                    noOfGuesses++;
            }

        }
    }

}

public class Guess_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a Number");

        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        Test t1 = new Test(52);
        t1.startGuess();

    }
}
