import java.util.Locale;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Primeiro Objeto
        Produto p1 = new Produto();
        
        System.out.printf("Nome: ");
        p1.setNome(sc.nextLine());
        System.out.printf("Preco: ");
        p1.setPreco(sc.nextDouble());
        System.out.printf("Quantidade: ");
        p1.setQuantidade(sc.nextInt());

        System.out.printf(p1.toString());

        // Segundo Objeto
        Produto p2 = new Produto("Notebook", 3500);
        System.out.printf(p2.toString());
        System.out.println(p2.getNome());

        // Terceiro Objeto
        Produto p3 = new Produto("Monitor", 1850, 2);
        System.out.printf(p3.toString());
        System.out.println(p3.getPreco());

        sc.close();
    }
}
