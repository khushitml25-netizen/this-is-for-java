import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit PIN: ");
        String pin = sc.nextLine();

        boolean valid = true;

        if (pin.length() != 4) {
            valid = false;
        } else {
            for (int i = 0; i < pin.length(); i++) {
                if (!Character.isDigit(pin.charAt(i))) {
                    valid = false;
                    break;
                }
            }
        }

        if (valid)
            System.out.println("Valid PIN");
        else
            System.out.println("Invalid PIN");
    }
}