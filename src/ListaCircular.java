public class ListaCircular {

    public No inicio;

    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);

        if (inicio == null) {
            novoNo.proximo = novoNo;
            inicio = novoNo;
        } else {
            novoNo.proximo = inicio;
            No ultimo = inicio;
            while (ultimo.proximo != inicio) {
                ultimo = ultimo.proximo;
            }
            ultimo.proximo = novoNo;
            inicio = novoNo;
        }
    }

    public void inserirNoFim(int valor) {
        No novoNo = new No(valor);

        if (inicio == null) {
            novoNo.proximo = novoNo;
            inicio = novoNo;
        } else {
            No ultimo = inicio;
            while (ultimo.proximo != inicio) {
                ultimo = ultimo.proximo;
            }
            ultimo.proximo = novoNo;
            novoNo.proximo = inicio;
        }
    }

    public void removeElemento(int valor) {
        if (inicio == null) {
            System.out.println("Erro: Lista vazia");
            return;
        }

        No atual = inicio;
        No anterior = null;

        do {
            if (atual.dado == valor) {
                if (atual.proximo == inicio && atual == inicio) {
                    inicio = null;
                    return;
                }

                if (atual == inicio) {
                    No ultimo = inicio;
                    while (ultimo.proximo != inicio) {
                        ultimo = ultimo.proximo;
                    }
                    ultimo.proximo = inicio.proximo;
                    inicio = inicio.proximo;
                }
                else {
                    anterior.proximo = atual.proximo;
                }
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        } while (atual != inicio);

        System.out.println("Erro: Elemento não encontrado");
    }

    public void exibirLista() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        No atual = inicio;
        StringBuilder elementos = new StringBuilder();

        do {
            elementos.append(atual.dado).append(" -> ");
            atual = atual.proximo;
        } while (atual != inicio);

        System.out.println(elementos.toString() + "(início)");
    }
}
