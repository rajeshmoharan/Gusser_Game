// package GusserGame;

import java.util.Scanner;

class Guesser{
    int guesser;
    
    public int  gussingNumber(){
        System.out.println("Gusses the number ");
        Scanner sc = new Scanner(System.in);
        guesser= sc.nextInt();
        return guesser;
    }
}

class Player{
    int guessNum;
    public int guessingNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player ! Kindly guess the Number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire{
    int numFromGusser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumberFromGusser(){
            Guesser  g = new Guesser();
            numFromGusser=g.gussingNumber();
    }
    public void collectNumFromPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }
    public void compare(){
        if (numFromGusser==numFromPlayer1){
            System.out.println("Player 1 Won the Game !");
        }
        else if(numFromGusser == numFromPlayer2){
            System.out.println("Player 2 Won the Game !");
        }
        else if(numFromGusser == numFromPlayer3){
            System.out.println("Player 3 Won the Game!");
        }
        else{
            System.out.println("No one Won the Game...Please Try again....");
        }
    }

}
class LaunchGame {
    public static void main(String[] args) {
        System.out.println("Game Started !");
        Umpire u = new Umpire();
        u.collectNumberFromGusser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
