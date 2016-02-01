package hebert_3_strings;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author raynehebert
 */
public class Hebert_3_Strings {
    
    static int magicnumber;
    static int userguess;
    static String username;
    static Random randy = new Random();
    static boolean playagain;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playagain = true;
        magicnumber = randy.nextInt(100);
        System.out.println("Hello, would you like to play our game?");
        System.out.println("What's your name?");
        Scanner userinputname = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLine();
        username = userinputname.nextLine();
        System.out.println("Hello " + username + "Let's play!");
        
        
        while (playagain){
            playthegame();
            
            static void playthegame(){
                Scanner userinputnumbers = new Scanner(System.in);
                System.out.println("Please pick a number");
                userguess = userinputnumbers.nextInt();
                if (magicnumber)
            
                    }
}
}
}



        
                // TODO code application logic here
    
    

