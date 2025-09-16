public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtores
    public Produto(){}
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }

    // toString
    public String toString(){
        return String.format("Nome: %s | Preco: %.2f | Quantidade: %d%n", nome, preco, quantidade);
    }
}
