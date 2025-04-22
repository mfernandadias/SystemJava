package projetoSistemaDeCadastroDeTarefasPessoais.service;

import projetoSistemaDeCadastroDeTarefasPessoais.model.Tarefa;

import java.util.ArrayList;

public class TarefaService {
    ArrayList<Tarefa> tarefas = new ArrayList<>();

   public void adicionarTarefa(Tarefa tarefa){
       tarefas.add(tarefa);
   }

   public ArrayList<Tarefa> listarTarefa(){
       return tarefas;
   }

   public void atualizarTarefas(int index, Tarefa novaTarefa){
       if(index >= 0 && index < tarefas.size()){
           tarefas.set(index, novaTarefa);
       }
   }

   public void removerTarefa(int index){
       if(index >= 0 && index < tarefas.size()){
           tarefas.remove(index);
       }
   }
}
