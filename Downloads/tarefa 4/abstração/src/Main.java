public class Main {

    public static void main(String[] args) {
        Universidade universidadePrinceton = new Universidade("Princeton (Nova Jersey - Estados Unidos da América)");
        Universidade universidadeCambridge = new Universidade("Cambridge (Inglaterra)");
        Pessoa albertEinstein = new Pessoa("Albert Einstein", universidadePrinceton);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", universidadeCambridge);

        System.out.println(albertEinstein.getDetalhes());
        System.out.println(isaacNewton.getDetalhes());
    }
}