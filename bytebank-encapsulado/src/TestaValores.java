public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        conta.setAgencia(-50);
        conta.setNumero(-330);
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número: " + conta.getNumero());

        Conta conta2 = new Conta(1337, 16549);

        System.out.println(Conta.getTotal());
    }
}
