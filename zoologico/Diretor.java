package zoologico;

public class Diretor extends Funcionario {
    private String setor;

    public Diretor(String nome, int matricula, String contato, double salario, String setor) {
        super(nome, matricula, contato, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
