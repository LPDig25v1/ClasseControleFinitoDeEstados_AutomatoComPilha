import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ControleFinitoDeEstados {
    private Stack<String> pilha;
    private Queue<String> fila;

    public ControleFinitoDeEstados() {
        pilha = new Stack<>();
        fila = new LinkedList<>();
    }

    public void processarEvento(String evento) {
        // Lógica para processar o evento e atualizar a pilha e a fila
        if (evento != null) {
            if (evento.equals("Empilhar")) {
                pilha.push("Item");
            } else if (evento.equals("Desempilhar")) {
                if (!pilha.isEmpty()) {
                    pilha.pop();
                }
            } else if (evento.equals("Enfileirar")) {
                fila.offer("Item");
            } else if (evento.equals("Desenfileirar")) {
                if (!fila.isEmpty()) {
                    fila.poll();
                }
            }
        }
    }

    public boolean pilhaVazia() {
        return pilha.isEmpty();
    }

    public boolean filaVazia() {
        return fila.isEmpty();
    }

    public static void main(String[] args) {
        ControleFinitoDeEstados controle = new ControleFinitoDeEstados();
        controle.processarEvento("Empilhar");
        controle.processarEvento("Enfileirar");
        System.out.println("Pilha vazia? " + controle.pilhaVazia());
        System.out.println("Fila vazia? " + controle.filaVazia());
    }
}

class TesteControleFinitoDeEstados {
    public static void main(String[] args) {
        ControleFinitoDeEstados controle = new ControleFinitoDeEstados();

        controle.processarEvento("Empilhar");
        controle.processarEvento("Enfileirar");

        System.out.println("Pilha vazia? " + controle.pilhaVazia());
        System.out.println("Fila vazia? " + controle.filaVazia());

        controle.processarEvento("Desempilhar");
        controle.processarEvento("Desenfileirar");

        System.out.println("Pilha vazia? " + controle.pilhaVazia());
        System.out.println("Fila vazia? " + controle.filaVazia());
    }
}
