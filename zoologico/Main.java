package zoologico;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("João", 1, "joao@example.com", 10000.0, "Administração");
        Veterinario veterinario = new Veterinario("Maria", 2, "maria@example.com", 8000.0, "Clínica Geral");
        Faxineiro faxineiro = new Faxineiro("José", 3, "jose@example.com", 2000.0);
        Cuidador cuidador = new Cuidador("Ana", 4, "ana@example.com", 3000.0, "Animais Silvestres");

        System.out.println("Diretor: " + diretor.getNome() + ", Setor: " + diretor.getSetor());
        System.out.println("Veterinário: " + veterinario.getNome() + ", Especialização: " + veterinario.getEspecializacao());
        System.out.println("Faxineiro: " + faxineiro.getNome());
        System.out.println("Cuidador: " + cuidador.getNome() + ", Especialização: " + cuidador.getEspecializacao());
    }
}