package projetoCadastroUsuario;
import projetoCadastroUsuario.model.Usuario;
import projetoCadastroUsuario.file.ArquivoUtils;
import projetoCadastroUsuario.service.UsuarioService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService();
        String caminhoArquivo = "usuarios.txt";

        while(true){
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Atualizar ");
            System.out.println("4. Excluir");
            System.out.println("5. Salvar arquivo");
            System.out.println("6. Sair");
            System.out.println("Escolha: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Nome: ");
                    String nome = scan.nextLine();
                    System.out.println("Telefone: ");
                    String telefone = scan.nextLine();
                    System.out.println("Cargo: ");
                    String cargo = scan.nextLine();

                    Usuario novoUsuario = new Usuario(nome, telefone, cargo);
                    usuarioService.adicionarUsuario(novoUsuario);  // <--- ESSA LINHA FALTAVA
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;
                case 2:
                    int i = 0;
                    for (Usuario u : usuarioService.listarUsuarios()) {
                        System.out.println(i + " - " + u);
                        i++;
                    }
                    break;
                case 3:
                    System.out.println("ìndice para atualizar: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scan.nextLine();
                    System.out.print("Novo telefone: ");
                    String novoTel = scan.nextLine();
                    System.out.print("Novo cargo: ");
                    String novoCargo = scan.nextLine();
                    Usuario atual = new Usuario(novoNome, novoTel, novoCargo);
                    usuarioService.atualizarUsuario(index, atual);
                    break;
                case 4:
                    System.out.print("Índice para excluir: ");
                    int excluir = scan.nextInt();
                    usuarioService.removerUsuario(excluir);
                    break;

                case 5:
                    ArquivoUtils.salvarUsuarios(usuarioService.listarUsuarios(), caminhoArquivo);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida.");

            }
        }

    }
}
