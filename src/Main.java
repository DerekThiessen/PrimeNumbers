import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Starting Value: ");
        Integer startingValue = Integer.parseInt(reader.readLine());

        System.out.println("Ending Value: ");
        Integer endingValue = Integer.parseInt(reader.readLine());


        System.out.println(new SieveOfEratosthenes().generate(startingValue, endingValue));
    }
}
