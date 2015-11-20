package hebert_3_guessinggame.java;

import java.util.Random;
import java.util.Scanner;

public class Hebert_3_GuessingGameJava {
    static int magicnumber;
    static int userguess;
    static String username;
    static Random randal = new Random();
    static boolean playagain;
    static int guessesleft=4;

    public static void main(String[] args) {
    playagain = true;
        magicnumber = randal.nextInt(50);
        System.out.println("Hello, would you like to play the guessing game?");
        System.out.println("What would your name happen to be?");
        
        System.out.println("Hello " + username + "! Let's play!");
        System.out.println("You only have 5 guesses.");
        Scanner userinputname = new Scanner(System.in);
    
        //sc.nextInt();
        //sc.nextLine();
        username = userinputname.nextLine();
    }    
        static void playthegame(){ 
        Scanner sc = new Scanner(System.in);
    // TODO code application logic here
}
    

}