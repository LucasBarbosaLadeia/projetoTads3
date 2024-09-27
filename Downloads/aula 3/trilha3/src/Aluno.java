public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String verificarIdade() {
        if (idade < 18) {
            return "Menor de idade";
        } else {
            return "Maior de idade";
        }
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nIdade: " + idade +
                "\nPeso: " + peso + " kg" +
                "\nAltura: " + altura + " m" +
                "\nStatus: " + verificarIdade() +
                "\nIMC: " + String.format("%.2f", calcularIMC());
    }
}
