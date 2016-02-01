package hebert_3_gamez;
import java.util.Scanner;

public class Hebert_3_Gamez {
static Scanner sc = new Scanner (System.in);
static int answer;
static int username;

    public static void main(String[] args) {
System.out.println("You wake up to a fire, burning all around you.");
System.out.println("What do you do?");
    System.out.println("Relax, don't worry about it");
    System.out.println("Start to panic, run around, looking for water");
    System.out.println("1.Relax\n2.PANIC");
     answer = sc.nextInt();
    if(answer == 2) {
        panicked();
    }
     if(answer == 1){
    relaxed ();
    }
    
    }
    public static void panicked (){
        System.out.println("Fire becomes enraged, growing larger and destroying more, including yourself");
        System.out.println("You lost your life.");
    
     
}
public static void relaxed (){
    System.out.println("The fire seems to die out as you relax.");
    System.out.println("'I have begun to control my abilities', you think to yourself");
    System.out.println("You begin to clean your home, erasing all evidence of the blazing fury that was there a minute ago");
    System.out.println("Soon there is not a scorch to be seen.");
    System.out.println("As you begin to leave, you see something burning in the corner of your eye, and it's hovering just above the floor.");
    System.out.println("You grab the thing, and it slithers out of your grip.");
    System.out.println("Confused, you try again to grasp the hovering flame, which is enlongating.");
    System.out.println("Do you choose to continue?");
    System.out.println("1.Yes\n2.No");
    answer = sc.nextInt();
    if(answer == 1) {
        yes();
}
    if(answer == 2) {
        no();
    }
}
public static void yes (){
    System.out.println("You try to grasp the flame once more, and too late do you realize that it was a snake, made of flames.");
    System.out.println("It bites you and everything fades to black");
    System.out.println("You lost your life");
  } 
public static void no (){
    System.out.println("You leave your hand hanging, and the creature- a fire snake- comes towards you and wraps itself around your arm.");
    System.out.println("Surprisingly, you aren't hurt.");
    System.out.println("Then the skies turn red, and as you walk outside you see people screaming in terror.");
    System.out.println("You look up, and can stare at the sun, or the raging of flames that used to be yellow, now they're red.");
    System.out.println("You can feel everything getting older, entropy is running at an accelerated rate.");
    System.out.println("Buildings crumble around you, the people run, and some get crushed.");
    System.out.println("You aren't aging. No one is. Not one living thing.");
    System.out.println("As a matter of fact, the others do seem to be aging. You haven't for years. You haven't changed one bit since sixteen.");
    System.out.println("You sit down and think about what's going on, and you hear a voice.");
    System.out.println("You ask who it is, and the answer shocks you, along with a strike of lightning:'I am the Universe' ");
    System.out.println("Universe: 'The Darkness heralds only one thing, Salamander. The end of Time itself.");
    System.out.println("So that's why everything is falling apart?");
    System.out.println("Universe: 'Yes, the questions were answered.'");
    System.out.println("What questions? Universe: 'The ultimate questions: What is the meaning of life, the Universe, and everything. And the other being: Who is The Doctor?'");
    System.out.println("And you're just going to die because of that?!");
    System.out.println("Universe: 'It is what must happen.'");
    System.out.println("Do you accept the End Of Time?");
    System.out.println("1.Yes\n2.No");
        answer = sc.nextInt();
    if(answer == 1) {
        live ();
}
    if(answer == 2) {
        die ();
    }    
}
public static void live (){
System.out.println("You let the Universe end, you get to live, and everyone you know dies. You live a lonely existence, forever waiting");

}
public static void die (){
System.out.println("I REFUSE THE END OF TIME");
System.out.println("Time stops, your body is ripped into atoms.");
System.out.println("You lost your life.");
System.out.println("Wait- no you didn't. This is wrong, I mislead you. You became the Universe, bonding at the atomic level, and your will overpowered it.");
System.out.println("You won. Congratulations, I aplaud you.");
}}