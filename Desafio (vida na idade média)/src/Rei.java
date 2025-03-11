public class Rei extends SerHumano{
    double dinheiro;
    double salario;

    public Rei(String nome, int idade, int descanso, boolean vivo, double dinheiro, double salario){
        super(nome, idade, descanso, vivo);
        this.dinheiro = dinheiro;
        this.salario = salario;
    }

    public void comprar(double valor, String item){
        dinheiro += valor;
        System.out.println(nome + " gastou " + valor + " comprando " + item + " com sucesso!");
    }

    public void Ordem(int random){
        switch(random) {
            case 1:
                System.out.println("Ordem 1: O Rei condena à morte o seguinte plebeu: " + "\n");
                break;
            case 2:
                System.out.println("Ordem 2: O Rei ordena que o seguinte plebeu pague indenizações: " + "\n");
                break;
            case 3:
                System.out.println("Ordem 3: O Rei ordena que o seguinte nobre seja destituído da sua posição: " + "\n");
                break;
            case 4:
                System.out.println("Ordem 4: O Rei ordena que o seguinte nobre pague indenizações por seus crimes: " + "\n");
                break;
            case 5:
                System.out.println("Ordem 5: O Rei ordena que o exército se prepare para a guerra." + "\n");
                break;
            case 6:
                System.out.println("Ordem 6: O Rei ordena que os cofres reais sejam reabastecidos com tributos dos nobres e plebeus."  + "\n");
                break;
            case 7:
                System.out.println("Ordem 7: O Rei ordena que um grande banquete seja preparado para a nobreza." + "\n");
                break;
            case 8:
                System.out.println("Ordem 8: O Rei decreta um novo imposto sobre o comércio para aumentar os recursos do reino." + "\n");
                break;
            default:
                System.out.println("Ordem inválida! O Rei ainda está decidindo seu próximo comando." + "\n");
                break;
        }
    }
}