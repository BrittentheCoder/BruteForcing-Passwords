
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class StoringData {
    public static void main(String[] args) throws IOException {
        PasswordChecker checker = new PasswordChecker();
        Scanner input = new Scanner(System.in);
        System.out.println("Number of trials: ");
        int trials = input.nextInt();
        System.out.println("Length of password(1-5): ");
        int length = input.nextInt();

        File file = new File("Passwords1.txt");
        try(
                FileWriter writer = new FileWriter(file);
        ){
        for (int i = 0; i < trials; i++) {
            long results = checker.ThePasswordChecker(length);
            writer.write(results + "\n");

        }
        writer.close();
        System.out.println("Successfully written");
        }
        catch (Exception e){
            System.out.println("Failed");
        }
    }


}


