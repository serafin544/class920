package guessingGame;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class guessingMain {

    public static void main(String[] args) {
        ArrayList<Integer> Attempts = new ArrayList<Integer>();
        Random r = new Random();
        int randInt = r.nextInt(100);
        Scanner scan = new Scanner(System.in);
        boolean correct = false;
        System.out.println("The random number has been created !!");
        do{
            System.out.println("Please enter a guess: ");
            int input = scan.nextInt();
            if(input ==randInt){
                System.out.println("Good Job");
                correct = true;
            }else if(Attempts.contains(input)){
                System.out.println("You have tried this number!! STUPId");
            } else{
                System.out.println("Wrong!! Please Try again!!");
                Attempts.add(input);
            }
        }while (!correct);

        System.out.println(Attempts.toString());


    }


}
