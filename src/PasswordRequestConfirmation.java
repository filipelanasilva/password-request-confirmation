
import java.util.Scanner;

public class PasswordRequestConfirmation {

    public static void main(String args[]) {


        passwordConfirmation();


    }








    public static String passwordRequest(Scanner arg) {

        System.out.print("Digit the password: ");
        return arg.next();

    }

    public static void passwordConfirmation() {

        Scanner scanner = new Scanner(System.in);

        String digitedPassword;
        String correctPassword = "Java21";
        int triesLimit = 3;

        while (triesLimit > 0) {

            digitedPassword = passwordRequest(scanner);

            if (digitedPassword.equalsIgnoreCase(correctPassword)) {

                System.out.println("Authorized access!");
                break;

            } else {

                triesLimit--;

                if (triesLimit == 0) {
                    System.out.println("Limit of tries exceeded! Account blocked!");
                    break;
                }

                System.out.println("Incorrect password! Tries left: " + triesLimit);

            }

        }

        scanner.close();

    }

}
