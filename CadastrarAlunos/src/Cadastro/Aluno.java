package Cadastro;

/*a) Cada aluno é caracterizado por:
    Nome: Exemplo: Jão Silva Martins
    Curso: Exemplo: CIC (Ciencia da computação)
    e-mail: Exemplo: jsmartins-cic@uesc.br
    número de matrícula: (AAAASxxxx) Exemplo 202513456 

b) O construtor da classe deve permitir criar uma instância:
    Dado todos os atributos da classe;
    Dado uma instância da classe definindo um novo curso e número de matrícula; 
    obs: para o número de matrícula será fornecido apenas o ano e o semestre. 
    O sequencial deve ser implementado como um atributo static. 

e) Deve ser implementado um método igualA que tem uma instância da classe com parâmetro de entrada;

f) Fazer uma versão static do método anterior; */


public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private String email;
    public static int id = 1;
    private static int ano = 0;

    public Aluno (int matricula) {
        if (ano == 0) ano = matricula/10;
        if (matricula/10 > ano) {
            ano = matricula/10;
            id = 1;        //Passou o ano e reiniciou a contagem de alunos
        }
        if(matricula/10 < ano) {
            matricula = ano * 10 + (matricula % 10); //Se o ano for anterior, muda ano para o atual
        }
        matricula *= 10000;
        matricula += id++;
        this.matricula = matricula;
    }

    public Aluno (String nome, String curso, int matricula) {   //criar email
        this (matricula);
        this.nome = nome;
        this.curso = curso;    
        curso = curso.toLowerCase();    //transformar todas as letras em minúsculas
        
        String[] partes = nome.split(" ");  //separa cada palavra do nome e armazena no array partes
        String iniciais = "";
        int tam = partes.length;
        for (int i = 0; i<tam - 1; i++) {
            if (Character.isUpperCase(partes[i].charAt(0))) {
                iniciais += partes[i].charAt(0);  //pega a inicial maiuscula de cada palavra menos a ultima e o /0
            }
        }
        iniciais = iniciais.toLowerCase ();
        String ultimo = partes [tam-1].toLowerCase();
        email = iniciais + ultimo + "-" + curso + "@uesc.br";
    }

    public Aluno (Aluno a, String curso, int matricula) {
        this (a.nome, curso, matricula);
    }

    public boolean IgualA (Aluno a) {
        if (matricula == a.matricula)
            return true;
        return false;
    }

    public static boolean IgualA (Aluno a1, Aluno a2) {
        if (a1.matricula == a2.matricula)
            return true;
        return false;
    }

    public int getMatricula () {
        return matricula;
    }

    public String getNome () {
        return nome;
    }

    public String getCurso () {
        return curso;
    }

    public String getEmail () {
        return email;
    }
    
    public String toString () {
        return ("Nome: " + nome + "\nCurso: " + curso + "\nemail: " + email + "\nMatricula: " + matricula);
    }
}
