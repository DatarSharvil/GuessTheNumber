import java.util.Scanner;
class NumberGuessingGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int randomNumber = (int)(Math.random() * 100) + 1;
            int guess = 0;
            int attempts = 0;
            System.out.println("I have selected a random INTEGER between 1 and 100 (Inclusive), can you guess it?");
            do {
                try {
                   System.out.println("Enter your guess: ");
                   guess = Integer.parseInt(sc.nextLine());  
                } catch (NumberFormatException e) {
                    System.out.println("Please enter an integer! ");
                    continue;
                }
                attempts++;
                if (guess < randomNumber) System.out.println("Too low!");
                else if (guess > randomNumber) System.out.println("Too high!");
            } while (guess != randomNumber);
            System.out.printf("You successfully guessed the number %d in %d attempt%s!", randomNumber, attempts, (attempts == 1) ? "" : "s");
        } catch (Exception e) {
            System.out.println("Oops! An unexpected error occured, please restart to try again.");
        }
    }
}