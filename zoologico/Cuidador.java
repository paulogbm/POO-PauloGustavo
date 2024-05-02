package zoologico;

public class Cuidador extends Funcionario {
    private String especializacao;

    public Cuidador(String nome, int matricula, String contato, double salario, String especializacao) {
        super(nome, matricula, contato, salario);
        this.especializacao = especializacao;
    }


    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}

