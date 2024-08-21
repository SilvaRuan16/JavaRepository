import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeContatos gerenciador = new GerenciadorDeContatos(10);
        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Sistema de Gerenciamento de Contatos com Vetor ===");
            System.out.println("Digite [1] para adicionar o contato a lista");
            System.out.println("Digite [2] para remover o contato da lista");
            System.out.println("Digite [3] para buscar o contato na lista");
            System.out.println("Digite [4] para listar os contatos");
            System.out.println("Digite [5] para encerrar o sistema");
            System.out.println("========================================================");
            System.out.print("\nEscolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("\nDigite o telefone: ");
                    String telefone = leitor.nextLine();
                    Contato novoContato = new Contato(nome, telefone);
                    gerenciador.adicionarContato(novoContato);
                    break;
                case 2:
                    System.out.print("\nDigite o nome do contato a ser removido: ");
                    String nomeRemover = leitor.nextLine();
                    gerenciador.removerContato(nomeRemover);
                    System.out.println("Contato removido da lista!");
                    break;
                case 3:
                    System.out.print("\nDigite o nome do contato a ser buscado: ");
                    String nomeBuscar = leitor.nextLine();
                    Contato contatoBuscado = gerenciador.buscarContato(nomeBuscar);
                    if (contatoBuscado != null) {
                        System.out.println(contatoBuscado);
                    } else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("\nLista de contatos:");
                    gerenciador.listaContatos();
                    break;
                case 5:
                    System.out.println("\nEncerrando o gerenciador...\nGerenciador encerrado.");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        leitor.close();
    }
}
