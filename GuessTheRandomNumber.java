import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int numberOfGuesses=0;

    Game(){
        Random random= new Random();
        this.number= random.nextInt(100);
    }
    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses=numberOfGuesses;
    }
    public int getNumberOfGuesses(){
        return numberOfGuesses;
    }

    public void takeUserInput(){
        System.out.print("  Guess The Number  :");
        Scanner scanner= new Scanner(System.in);
        inputNumber = scanner.nextInt();
    }
    boolean isCorrectNumber() {
        numberOfGuesses++;
        if( inputNumber==number){
            System.out.println(" You Guessed  Right Number: Number  Is   "+ number +" IN : "+numberOfGuesses+" Attemps :" );
            return true;
        } else if (inputNumber<number) {
            System.out.println(" Number Is Too Low :");
        } else if (inputNumber>number) {
            System.out.println(" Number Is Too High: ");
        }
        return false ;
    }


}

public class GuessTheRandomNumber {
    public static void main(String[] args) {
        System.out.println(" ----------------------WELCOME TO RENDOM NUMBER GAME :-------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print(" DO YOU WANT TO PLAY GAME Y /N :");
        String input = scanner.next();
        char character = input.charAt(0);
        if (character == 'y' || character == 'Y') {
            System.out.println(" Lets Play the Game :  Good Luck !");
        } else if (character == 'N' || character == 'n') {
            System.out.println(" Thanks for Visiting  Good  By !");
        } else {
            System.out.println("Invalid input. Please enter Y or N.");
        }

        System.out.println(" ----------------------Game Is Started :------------------------------------- ");

        Game game = new Game();
        boolean bol = false;
        while (!bol) {
            game.takeUserInput();
            bol = game.isCorrectNumber();
        }
    }
}


