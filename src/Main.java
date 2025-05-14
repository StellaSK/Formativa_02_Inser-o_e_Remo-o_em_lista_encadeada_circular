public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        // Testes
        lista.inserirNoFim(10);
        lista.inserirNoInicio(5);
        lista.inserirNoFim(20);
        lista.exibirLista();

        lista.removeElemento(10);
        lista.exibirLista();

        lista.removeElemento(5);
        lista.exibirLista();

        lista.removeElemento(20);
        lista.exibirLista();
    }
}
