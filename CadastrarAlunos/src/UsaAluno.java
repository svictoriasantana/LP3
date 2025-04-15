import Cadastro.Aluno;

public class UsaAluno {
    public static void main (String[] args) {
        Aluno aluno1 = new Aluno ("Victoria Andrea Santana", "cic", 20241);
        Aluno aluno2 = new Aluno ("Robertos Carlos Rocha", "eng", 20241);
        Aluno aluno3 = new Aluno ("Robertos Carlos Rocha", "eng", 20241);
        
        System.out.println (aluno1);
        System.out.println (aluno2);
        System.out.println (aluno3);

        boolean igual = aluno2.IgualA(aluno3);
        if (igual) {
            System.out.println ("Alunos 2 e 3 sao a mesma pessoa.\n");
        } else {
            System.out.println ("Alunos 2 e 3 sao diferentes.\n");}

        igual = Aluno.IgualA(aluno2, aluno3);
        if (igual) {
            System.out.println ("Alunos 2 e 3 sao a mesma pessoa.\n");
        } else {
            System.out.println ("Alunos 2 e 3 sao diferentes.\n");}
        
        Aluno aluno4 = new Aluno (aluno3, "agro", 20251);
        System.out.println (aluno4);
    }

}
