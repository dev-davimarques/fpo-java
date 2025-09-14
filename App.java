package firstClass;
import java.util.Locale;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        // 3o. Forma método construtor e instanciando pela própria classe
        MinhaClasse pessoa = new MinhaClasse();
        
        // 1o. Forma de atribuir valores aos meus atributos
        pessoa.setNome("Davi Marques");
        pessoa.setAnoNascimento(2000);

        // 2o. Forma de atribuir valores aos meus atributos
        // System.out.print("Nome: ");
        // pessoa.nome = sc.nextLine();

        // System.out.print("Ano de nascimento: ");
        // pessoa.anoNascimento = sc.nextInt();

        System.out.println("----------------");
        System.out.println(pessoa.toString());

        sc.close();
    }
}