import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN: " + ssn);

        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("Valid UC Student M Number: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Valid Menu Choice: " + menuChoice);
    }
}