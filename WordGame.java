import java.util.Scanner;

public class WordGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int wordCount = 0;
        String previousWord = "";
        String currentWord;

        System.out.println("Welcome to the Word Game! Enter the first word:");
        currentWord = scanner.nextLine();
        wordCount++;
        
        while (score < 50) {
            if (wordCount == 1) {
                System.out.println("First word entered: " + currentWord);
            } else {
                int points = 0;
                
                if (currentWord.compareTo(previousWord) > 0) {
                    points += 2;
                    System.out.println("Alphabetically after: +2");
                } else if (currentWord.compareTo(previousWord) < 0) {
                    points -= 5;
                    System.out.println("Alphabetically before: -5");
                }
                if (currentWord.equals(previousWord)) {
                    points -= 10;
                    System.out.println("Same word as previous: -10");
                }
                if (previousWord.length() >= 2 && currentWord.length() >= 2 && 
                    previousWord.substring(previousWord.length() - 2).equals(currentWord.substring(0, 2))) {
                    points += 5;
                    System.out.println("Last two match first two: +5");
                }
                if (currentWord.contains(Character.toString(previousWord.charAt(0)))) {
                    points += 3;
                    System.out.println("First letter of previous found in current: +3");
                }
                if (currentWord.length() == previousWord.length()) {
                    points += 4;
                    System.out.println("Same length as previous word: +4");
                }
                
                score += points;
                System.out.println("Points this round: " + points);
            }
            
            System.out.println("Current score: " + score);
            if (score < 50) {
                previousWord = currentWord;
                System.out.println("Enter the next word:");
                currentWord = scanner.nextLine();
                wordCount++;
            }
        }

        System.out.println("Congratulations! You reached 50 points or more.");
        System.out.println("It took you " + wordCount + " words.");
        scanner.close();
    }
}
