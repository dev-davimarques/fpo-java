public class MinhaClasse {
    private String nome;
    private int anoNascimento;
    private int anoAtual = 2025;

    // Getters e Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    public int getAnoNascimento(){
        return anoNascimento;
    }

    // Construtor
    // public MinhaClasse(String nome, int anoNascimento){
    //     this.nome = nome;
    //     this.anoNascimento = anoNascimento;
    // }

    public int calcularIdade(int anoNascimento){
        return anoAtual - anoNascimento;
    }

    public String toString(){
        return String.format("Nome: %s%nIdade: %d", nome, calcularIdade(anoNascimento));
    }
}
