import java.util.Scanner;

class Game{
    int userNumber;
    int compNumber;
    int counter = 0;
    public Game(){
        compNumber = (int)(Math.random()*100);
        System.out.println(compNumber);
    }
    public void setNum(int n){
        userNumber = n;
    }
    public int isCorrect(){
        if(userNumber > compNumber) return -1;
        else if(userNumber < compNumber) return 1;
        else return 0;
    }
    public void Counter(){
        counter++;
    }
}
public class L43_Excercise {
    public static void main(String[] args) {
//        Create a class Game, which allows a user to play "Guess the Number" game once.
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!


        Game obj = new Game();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true){
            System.out.println("Enter a number between 1-100: ");
            n = sc.nextInt();
            obj.setNum(n);

            if(obj.isCorrect() == 0){
                obj.Counter();
                System.out.println("Congratulations, You've guessed the number.");
                System.out.println("Number of counts: " + (obj.counter));
                break;
            }
            else if(obj.isCorrect() == 1){
                obj.Counter();
                System.out.println("Higher number please!");
            }
            else if(obj.isCorrect() == -1){
                obj.Counter();
                System.out.println("Lower number please!");
            }
        }
    }
}