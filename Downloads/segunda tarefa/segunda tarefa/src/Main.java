public class Main {
    public static void main(String[] args) {
        // Criando uma conta com saldo inicial
        Conta conta1 = new Conta("13542", "Lucas da Silva", 500.00);


        System.out.println(conta1);



        conta1.depositar(400.00);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());
        System.out.println();


        conta1.sacar(900.00);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());
        System.out.println();

        // Realizando um saque válido
        conta1.sacar(150.00);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());
    }
}