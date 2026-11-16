import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
       SistemaBiblioteca sistema = new SistemaBiblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistema de Biblioteca ===");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Remover livro");
            System.out.println("4. Emprestar livro");
            System.out.println("5. Devolver livro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("=============================");
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite a categoria do livro: ");
                    String categoria = scanner.nextLine();
                    Livro novoLivro = new Livro(titulo, autor, categoria);
                    sistema.adicionarLivro(novoLivro);
                    break;
                case 2:
                    sistema.listarLivros();
                    break;
                case 3:
                    System.out.print("Digite o título do livro a ser removido: ");
                    String tituloRemover = scanner.nextLine();
                    sistema.removerLivro(tituloRemover);
                    break;
                case 4:
                    System.out.print("Digite o título do livro a ser emprestado: ");
                    String tituloEmprestar = scanner.nextLine();
                    sistema.emprestarLivro(tituloEmprestar);
                    break;
                case 5:
                    System.out.print("Digite o título do livro a ser devolvido: ");
                    String tituloDevolver = scanner.nextLine();
                    sistema.devolverLivro(tituloDevolver);
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
