package gestaoEscola;

public class Main {
    public static void main(String[] args) {
       
        Curso curso = new Curso("2024", "Análise e Desenvolvimento de Sistemas");
        Responsavel responsavel = new Responsavel(1, "Waldimir Ferreira", "Rua Desembargador N Existe, 123", "1234-5678", "111.222.333-44", 1, 5000.00);
        Aluno aluno = new Aluno(1, "Maria Clara Pacheco", "Rua Desembargador N Existe, 123", "9985-6236", "555.666.777-88", "20241001", "01/03/2024", responsavel, curso);
        Turma turma = new Turma(1, "Turma A", 40, curso);
        TurmaAluno turmaAluno = new TurmaAluno(turma, aluno, "P.O.O", 8.5);

        
        System.out.println("Aluno: " + turmaAluno.getAluno().getNome());
        System.out.println("Curso: " + turmaAluno.getAluno().getCurso().getCurso());
        System.out.println("Turma: " + turmaAluno.getTurma().getTurma());
        System.out.println("Disciplina: " + turmaAluno.getDisciplina());
        System.out.println("Nota: " + turmaAluno.getNota());
    }
}

