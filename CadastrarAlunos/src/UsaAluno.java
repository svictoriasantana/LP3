import Cadastro.Aluno;
import java.util.Scanner;

public class UsaAluno {
    public static void main (String[] args) {
        Aluno aluno1;
        Scanner scanf = new Scanner (System.in);
        System.out.print("\nDigite seu nome: ");
        String nome = scanf.nextLine(); // lê a linha inteira
        System.out.print("Digite seu curso: ");
        String curso = scanf.nextLine();
        System.out.print("Digite seu matricula: ");
        int matricula = scanf.nextInt();
        scanf.nextLine(); // LIMPA o buffer antes de ler a próxima linha
        aluno1 = new Aluno (nome, curso, matricula);
        System.out.println("\nNome do aluno 1: " + aluno1.getNome());
        System.out.println("Curso do aluno 1: " + aluno1.getCurso());
        System.out.println("Matricula do aluno 1: " + aluno1.getMatricula());
        System.out.println("E-mail do aluno 1: " + aluno1.getEmail());

        Aluno aluno2;
        System.out.print("\nDigite seu nome: ");
        nome = scanf.nextLine(); // lê a linha inteira
        System.out.print("Digite seu curso: ");
        curso = scanf.nextLine();
        System.out.print("Digite seu matricula: ");
        matricula = scanf.nextInt();
        aluno2 = new Aluno (nome, curso, matricula);
        System.out.println("\nNome do aluno 2: " + aluno2.getNome());
        System.out.println("Curso do aluno 2: " + aluno2.getCurso());
        System.out.println("Matricula do aluno 2: " + aluno2.getMatricula());
        System.out.println("E-mail do aluno 1: " + aluno2.getEmail());
        scanf.close();
    }

}
