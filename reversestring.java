import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sent to revese");
        String sen = in.nextLine();
        StringBuilder sent = new StringBuilder(sen);
        System.out.println("The reverse string is: ");
        System.out.println(sent.reverse().toString());

    }

}
