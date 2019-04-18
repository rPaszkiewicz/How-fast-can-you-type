package entity;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Words words = new Words();

        System.out.println("Would You like to add your own words Y/N ?");
        String choice = reader.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Enter words to add.");
        }
        /*fix validation*/
        while (true){
            String word = reader.nextLine();
                if (word.equals("0"))
                    break;
                words.addWords(word);
        }
        words.print();
        words.deleteWords(1);
        words.print();
    }
}
