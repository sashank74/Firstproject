import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string: ");
        // String word = in.nextLine();
        char[] word = in.nextLine().toCharArray();
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c ", word[j]);
            }
            System.out.println("\n");

        }

    }

}
