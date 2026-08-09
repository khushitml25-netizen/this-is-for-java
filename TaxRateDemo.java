class Employee {
    static double taxRate;

    // Static block runs only once when the class is loaded
    static {
        taxRate = 10.0;
        System.out.println("Tax rate initialized: " + taxRate + "%");
    }

    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - Tax Rate: " + taxRate + "%");
    }
}

public class TaxRateDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Priya");

        e1.display();
        e2.display();
    }
}