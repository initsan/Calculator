import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        ToNumbers toNumbers = new ToNumbers();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // enter string
            String entranceData = reader.readLine();
            // numbers from string to int
            int x = toNumbers.parseToInt(entranceData, 0);
            int y = toNumbers.parseToInt(entranceData, 1);
            //System.out.println(x + " " + y);
            if ((x <= 0 || x > 10) || (y <= 0 || y > 10))
                throw new NumberFormatException();
            else System.out.println(calc.count(entranceData, x, y));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
