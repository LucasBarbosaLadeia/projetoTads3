public class Pessoa {
    private String nome;
    private Universidade universidade;

    public Pessoa(String nome, Universidade universidade) {
        this.nome = nome;
        this.universidade = universidade;
    }
    public String getDetalhes() {
return "nome: " + nome + ", Universidade: " + universidade.getNome();

    }
}
