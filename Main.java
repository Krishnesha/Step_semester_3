class Employee {

    // Instance variables
    String empName;
    double salary;

    // Static variables
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    // Constructor
    Employee(String empName, double salary) {

        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    // Static method
    static void printCompanyInfo() {

        System.out.println(companyName);
        System.out.println("Employees on record: "
                + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create three employees
        Employee e1 =
                new Employee("Arun", 50000);

        Employee e2 =
                new Employee("Priya", 60000);

        Employee e3 =
                new Employee("Rahul", 55000);

        // Call static method using CLASS NAME
        Employee.printCompanyInfo();
    }

    public void insertAt(int index, int token) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertAt'");
    }

    public void addFirst(int nextInt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addFirst'");
    }

    public void addLast(String nextInt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addLast'");
    }

    public void display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }

    public void remove(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    public void printForward() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printForward'");
    }

    public void printBackward() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printBackward'");
    }
}