package SistemaCadastro;


public class Colaborador {
    private int Matricula;
    private String Nome;
    private Setor Set;

    public Colaborador() {
    }

    public Colaborador(int Matricula, String Nome) {
        this.Matricula = Matricula;
        this.Nome = Nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Setor getSetor() {
        return Set;
    }

    public void setSet(Setor Set) {
        this.Set = Set;
    }
    
    
}
