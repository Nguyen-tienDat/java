
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atmTest {
    public static void main(String[] args) {
        List<information> info = new ArrayList<>();
        info.add(new information("001", "Dat", "123456", 1000000));
        info.add(new information("002", "Duc", "123467", 5000000));

        Scanner sc = new Scanner(System.in);
        information authenticatedInfo = null;
        while (authenticatedInfo == null) {
            System.out.println("Enter the ID: ");
            String id = sc.nextLine();

            System.out.println("Enter the Password: ");
            String password = sc.nextLine();

            for (information info1 : info) {
                if (info1.getId().equals(id) && info1.getPassword().equals(password)) {
                    authenticatedInfo = info1;
                    break;
                }
            }
            if (authenticatedInfo == null) {
                System.out.println("ID or Password is incorrect. Try again.");
            }
        }
        coreATM atm = new coreATM(authenticatedInfo);
        atm.Menu();
        sc.close();
    }
}
