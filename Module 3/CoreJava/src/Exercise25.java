import java.util.HashMap;
import java.util.Scanner;
public class Exercise25 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID and name (type '-1' to stop):");
        while (true) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            if (id == -1) break;
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }
        System.out.print("Enter ID to retrieve name: ");
        int searchId = sc.nextInt();
        String result = studentMap.get(searchId);
        if (result != null) {
            System.out.println("Name: " + result);
        } else {
            System.out.println("No student found with ID " + searchId);
        }
        sc.close();
    }
}
