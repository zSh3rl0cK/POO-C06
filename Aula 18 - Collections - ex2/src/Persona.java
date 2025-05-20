public abstract class Persona implements Comparable<Persona>{
    private String nome;
    private int idade;

    @Override
    public int compareTo(Persona o) {
        return this.nome.compareTo(o.nome);
    }
}
