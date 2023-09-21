package Desafios.D1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.printf("O número total de tarefas na lista é: %d\n", listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("ListaUm");
        listaTarefa.adicionarTarefa("ListaUm");
        listaTarefa.adicionarTarefa("ListaDois");
        listaTarefa.adicionarTarefa("ListaTres");
        System.out.printf("O número total de tarefas na lista é: %d\n", listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("ListaUm");
        System.out.printf("O número total de tarefas na lista é: %d\n", listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
