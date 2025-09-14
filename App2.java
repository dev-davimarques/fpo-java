import java.util.Locale;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Quadrilatero q = new Quadrilatero();

        System.out.println("lado: ");
        q.lado = sc.nextDouble();

        System.out.println("Base menor: ");
        q.baseMenor = sc.nextDouble();

        System.out.println("Base maior: ");
        q.baseMaior = sc.nextDouble();

        System.out.println(q.calcularArea(q.lado));
        System.out.println(q.calcularArea(q.baseMaior, q.baseMenor));

        sc.close();
    }
}
