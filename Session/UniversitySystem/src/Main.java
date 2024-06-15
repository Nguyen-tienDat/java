import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Management mm = new Management();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Entere Student ID: ");
            String id = sc.nextLine();

            if (mm.authentication(id) != null) {
                System.out.println("Login Successful, bonjour " + mm.getLoginAcc().getName());
                while (true) {
                    System.out.println("___Moodle___");
                    System.out.println("Enter your choice: ");
                    System.out.println("1. Information query: ");
                    System.out.println("2. GPA Comparison: ");
                    System.out.println("3. Age Comparison: ");
                    System.out.println("4. Exit");

                    sc = new Scanner(System.in);
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("ID: " + mm.getLoginAcc().getId());
                            System.out.println("Name: " + mm.getLoginAcc().getName());
                            System.out.println("Age: " + mm.getLoginAcc().getAge());
                            System.out.println("GPA: " + mm.getLoginAcc().getGpa());
                            break;
                        case 2:
                            mm.compareGPA(mm.getLoginAcc().getGpa());
                            break;
                        case 3:
                            mm.compareAge(mm.getLoginAcc().getAge());
                            break;
                        case 4:
                            System.out.println("Exit System. Au revoir!");
                            return;
                        default:
                            System.out.println("Invalid choice. Try again!");

                    }
                }

            }
            else {
                System.out.println("Login failed...Try again!");
            }
        }
    }
}