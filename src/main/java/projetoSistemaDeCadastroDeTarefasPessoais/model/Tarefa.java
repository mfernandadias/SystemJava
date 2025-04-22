package projetoSistemaDeCadastroDeTarefasPessoais.model;

public class Tarefa {
    private String tituloTarefa;
    private String descricao;
    private String prioridade;

    public Tarefa(String tituloTarefa, String prioridade, String descricao) {
        this.tituloTarefa = tituloTarefa;
        this.prioridade = prioridade;
        this.descricao = descricao;
    }

    public String getTituloTarefa() {
        return tituloTarefa;
    }

    public void setTituloTarefa(String tituloTarefa) {
        this.tituloTarefa = tituloTarefa;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "tituloTarefa='" + tituloTarefa + '\'' +
                ", descricao='" + descricao + '\'' +
                ", prioridade='" + prioridade + '\'' +
                '}';
    }
}
