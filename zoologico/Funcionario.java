package zoologico;

public class Funcionario {
    private String nome;
    private int matricula;
    private String contato;
    private double salario;

    public Funcionario(String nome, int matricula, String contato, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.contato = contato;
        this.salario = salario;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}