import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to write to file: ");
        String input = sc.nextLine();
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(input);
            writer.close();
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}