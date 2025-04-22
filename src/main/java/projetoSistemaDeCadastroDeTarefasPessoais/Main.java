package projetoSistemaDeCadastroDeTarefasPessoais;
import java.util.Scanner;

import projetoSistemaDeCadastroDeTarefasPessoais.service.TarefaService;
import projetoSistemaDeCadastroDeTarefasPessoais.file.ArquivoTarefas;
import projetoSistemaDeCadastroDeTarefasPessoais.model.Tarefa;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TarefaService tarefaService = new TarefaService();
        String caminhoArquivo = "tarefas.txt";

        while(true){
            System.out.println("\n1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Atualizar");
            System.out.println("4. Excluir");
            System.out.println("5. Salvar em arquivo");
            System.out.println("6. Sair");
            System.out.println("Excluir");
            int opcao = scan.nextInt();
            scan.nextLine();
            /*
            private String tituloTarefa;
    private String descricao;
    private String prioridade;
             */
            switch(opcao){
                case 1:
                    System.out.println("Insira o Titulo de Tarefa");
                    String tituloTarefa = scan.nextLine();
                    System.out.println("Digite a descricao da tarefa");
                    String descricao = scan.nextLine();
                    System.out.println("Digite a prioridade da terafa (alta, media e inferior)");
                    do{

                    }while()
            }
        }

    }
}
