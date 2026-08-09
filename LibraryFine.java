import java.util.Scanner;

class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();

        int fine;

        if (days <= 0) {
            fine = 0;
        } else {
            fine = days * 5;
        }

        System.out.println("Fine = ₹" + fine);
    }
}