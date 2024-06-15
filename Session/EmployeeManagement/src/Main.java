import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("_____EMPLOYEE MANAGEMENT SYSTEM _____");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Find Employees by Name");
            System.out.println("5. Display All Employees");
            System.out.println("6. Exit");
            System.out.println("Choose your option: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the ID: ");
                    int eplID = sc.nextInt();

                    System.out.print("Enter the Name: ");
                    String eplName = sc.nextLine();

                    System.out.print("Enter the Age: ");
                    int eplAge = sc.nextInt();

                    System.out.print("Enter the Salary: ");
                    double eplSalary = sc.nextDouble();

                    management.addEmployee( new Employee(eplID, eplName, eplSalary, eplAge));
                    break;

                case 2:
                    System.out.print("Enter the ID of the Employee to Update: ");
                    eplID = sc.nextInt();

                    System.out.print("Enter the Name: ");
                    eplName = sc.nextLine();

                    System.out.print("Enter the Age: ");
                    eplName = sc.nextLine();

                    System.out.print("Enter the Salary: ");
                    eplSalary = sc.nextDouble();
                    break;

                case 3:
                    System.out.println("Enter the ID of the Employee to Delete: ");
                    eplID = sc.nextInt();
                    management.deleteEmployee(eplID);
                    break;

                case 4:
                    System.out.println("Enter the Name to search: ");
                    name = sc.nextLine();
                    List<Employee> employeeList = management.findByName(eplName);
                    for (Employee employee : employeeList){
                        System.out.println(employee);

                    }
                    break;

                case 5:
                    List<Employee> showAllEmployee = management showAllEmployee();
                    for (Employee employee : employeeList){
                        System.out.println(employee);
                    }
                    break;

                case 6:
                    System.out.println("System Exiting... Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
