package br.inate.pcmania.computador;

public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional SO;
    public HardwareBasico [] HB;
    public MemoriaUSB ME;

    // construtor
    public Computador(String marca, float preco, SistemaOperacional SO, HardwareBasico[] HB) {
        this.marca = marca;
        this.preco = preco;
        this.SO = SO;
        this.HB = HB;
    }

    public void addMemoria(MemoriaUSB memoria) {
        this.ME = memoria;
    }

    // méto.do para mostrar as configurações
    public void mostraPCConfigs() throws InterruptedException {
        // Imprimindo cada configuração na ordem

        System.out.println("Marca: " + marca);
        Thread.sleep(500);

        System.out.println("Preco: " + preco + " reais");
        Thread.sleep(500);

        System.out.println("Sistema Operacional: " + SO.nome);
        Thread.sleep(500);

        System.out.println("Hardware Basico: ");
        System.out.println(HB[0].nome + " " + HB[0].capacidade + " Mhz");
        System.out.println(HB[1].nome + " " +HB[1].capacidade + " GB");

        // Caso a memória tenha 1Tb ou mais
        if(HB[2].capacidade >= 1024) {
            System.out.println(HB[2].nome + " " + HB[2].capacidade/1024 + " Tb");
        }
        // Memória padrão em Gb
        else{
            System.out.println(HB[2].nome  +  " " + HB[2].capacidade + " Gb");
        }

        Thread.sleep(500);

        // capacidade da memoria USB em Tb
        if (ME.capacidade >= 1024) {
            System.out.println("Memoria USB extra: " + ME.nome + " " + ME.capacidade / 1024 + " Tb\n");
        }
        // Capacidade em Gb
        else {
            System.out.println("Memoria USB extra: " + ME.nome + " " + ME.capacidade + " Gb\n");
        }

        Thread.sleep(500);
    }
}
