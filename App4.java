import java.util.Locale;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        Product p1 = new Product("Television", 2000, 5);
        System.out.printf(p1.toString());
        p1.removeBalance(1);
        System.out.printf(p1.toString());
        p1.addBalance(2);
        System.out.printf(p1.toString());

        p1.setPrice(3000);
        p1.removeBalance(1);
        System.out.printf(p1.toString());

        input.close();
    }
}
