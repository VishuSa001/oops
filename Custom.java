import org.omg.Messaging.SyncScopeHelper;

//Create a class Employee with fied float salary = 40000.
//Create a class PermanentEmp which will inhertis the property of Employee and has its field PermanentEmp.
//create another class TemporaryEmp which will inherits the propert of Employee class and its field double hike = 0.35.
//create a main method and object of sub class and call all the fields of classes.

class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("This is my " + id);
        System.out.println("This is  " + name);
    }

    public int getSalary() {
        return salary;
    }

    // public int setSalary() {
    // return salary;
    // }
}

public class Custom {
    public static void main(String[] args) {
        System.out.println("This is custom class");
        Employee vishal = new Employee();// instantian of a new Employee
        Employee shivam = new Employee();// instantian of a new Employee

        // setting properties and Attributes
        vishal.id = 45;
        vishal.salary = 40000;
        vishal.name = "Vishalsaini";

        // setting Attributes of shivam
        shivam.id = 46;
        shivam.salary = 30000;
        shivam.name = "Shivamsaini";

        vishal.printDetails();
        shivam.printDetails();

        int salary = shivam.getSalary();
        System.out.println(salary);

        // int salary2 = vishal.getsalary();
        // System.out.println(salary);

        // printing the Attributes
        // System.out.println(vishal.id);
        // System.out.println(vishal.name);

    }
}