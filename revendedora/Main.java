package revendedora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VeiculoDAO veiculoDAO = new VeiculoDAO();

        ConexaoBD.criarTabela();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1- Cadastrar");
            System.out.println("2- Consultar");
            System.out.println("3- Atualizar");
            System.out.println("4- Excluir");
            System.out.println("0- Sair");
            int opcao = scanner.nextInt();

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    Carro carro = new Carro();
                    System.out.print("Marca: ");
                    carro.setMarca(scanner.next());
                    System.out.print("Modelo: ");
                    carro.setModelo(scanner.next());
                    System.out.print("Ano: ");
                    carro.setAno(scanner.nextInt());
                    System.out.print("Preço: ");
                    carro.setPreco(scanner.nextDouble());
                    veiculoDAO.cadastrar(carro);
                    break;
                case 2:
                    System.out.print("ID do veículo: ");
                    int idConsulta = scanner.nextInt();
                    Veiculo veiculoConsulta = veiculoDAO.consultar(idConsulta);
                    if (veiculoConsulta != null) {
                        System.out.println("Marca: " + veiculoConsulta.getMarca());
                        System.out.println("Modelo: " + veiculoConsulta.getModelo());
                        System.out.println("Ano: " + veiculoConsulta.getAno());
                        System.out.println("Preço: " + veiculoConsulta.getPreco());
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;
                case 3:
                    Veiculo veiculoAtualizar = new Veiculo();
                    System.out.print("ID do veículo: ");
                    veiculoAtualizar.setId(scanner.nextInt());
                    System.out.print("Nova marca: ");
                    veiculoAtualizar.setMarca(scanner.next());
                    System.out.print("Novo modelo: ");
                    veiculoAtualizar.setModelo(scanner.next());
                    System.out.print("Novo ano: ");
                    veiculoAtualizar.setAno(scanner.nextInt());
                    System.out.print("Novo preço: ");
                    veiculoAtualizar.setPreco(scanner.nextDouble());
                    veiculoDAO.atualizar(veiculoAtualizar);
                    break;
                case 4:
                    System.out.print("ID do veículo: ");
                    int idExcluir = scanner.nextInt();
                    veiculoDAO.excluir(idExcluir);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
