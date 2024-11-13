package gestaoEscola;

public class Aluno extends Pessoa {
    private String matricula;
    private String dataMatricula;
    private Responsavel responsavel;
    private Curso curso;

    // Construtor
    public Aluno(int idPessoa, String nome, String endereco, String telefone, String cpf, String matricula, String dataMatricula, Responsavel responsavel, Curso curso) {
        super(idPessoa, nome, endereco, telefone, cpf);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
        this.responsavel = responsavel;
        this.curso = curso;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}

