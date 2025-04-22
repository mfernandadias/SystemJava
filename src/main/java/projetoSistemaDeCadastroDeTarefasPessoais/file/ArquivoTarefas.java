package projetoSistemaDeCadastroDeTarefasPessoais.file;

import projetoSistemaDeCadastroDeTarefasPessoais.model.Tarefa;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;


public class ArquivoTarefas {
    public static void salvarTarefas(List<Tarefa> tarefas, String caminhoArquivo){
        try(FileWriter writer = new FileWriter(caminhoArquivo)){
            for(Tarefa u : tarefas){
                writer.write(u.toString() + "\n");
            }
            System.out.println("Dados salvos com sucesso");
        }catch(IOException e){
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}
