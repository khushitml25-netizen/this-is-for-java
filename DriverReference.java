class Driver {
    String name;
    String status;

    Driver(String name) {
        this.name = name;
        this.status = "Available";
    }
}

class Trip {
    Driver driver;

    Trip(Driver driver) {
        this.driver = driver;
    }

    void display() {
        System.out.println("Driver: " + driver.name);
        System.out.println("Status: " + driver.status);
    }
}

public class DriverReference {
    public static void main(String[] args) {

        Driver d1 = new Driver("Rohit");

        Trip trip1 = new Trip(d1);
        Trip trip2 = new Trip(d1);

        System.out.println("Before changing status:");
        trip1.display();
        trip2.display();

        // Change status using first booking reference
        trip1.driver.status = "Busy";

        System.out.println("\nAfter changing status:");
        trip1.display();
        trip2.display();
    }
}
