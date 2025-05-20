public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Makoto Yuki", 12312);
        Cliente cliente2 = new Cliente("Mike Yuki", 12312);
        Cliente cliente3 = null;

        Conta conta1 = new Conta(3800, 1336);


        conta1.setCliente(cliente1);
        conta1.setCliente(cliente3);
        conta1.setCliente(cliente2);

        conta1.mostraInfo();
        System.out.println("\n"+"O codigo executou eba");
    }
}