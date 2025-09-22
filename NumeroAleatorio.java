public class NumeroAleatorio {
    public static void main(String[] args) {
        // Numero aleatorio entre 0 e 1
        double numeroAleatorio = Math.random();
        System.out.println("Numero aleatorio: "+numeroAleatorio);

        // Gera um numero aleatorio inteiro entre 0 e 99
        int numeroInteiroAleatorio = (int) (Math.random() * 100);
        System.out.println("Numero inteiro aleatorio "+numeroInteiroAleatorio);

        
    }
}
