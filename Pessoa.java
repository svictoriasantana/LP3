public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0)
            this.idade = idade;
    }

    public void fazerAniversario() {
        idade++;
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + " anos.";
    }

    public static void main (String[] args) {
        Pessoa p1 = new Pessoa ("Juliana", 12);
        Pessoa p2 = new Pessoa ("Jose");
        System.out.println (p1);
        System.out.println (p2);
        p2.setIdade(17);
        System.out.println (p2);
        p1.fazerAniversario();
        System.out.println (p1);
    }
}
