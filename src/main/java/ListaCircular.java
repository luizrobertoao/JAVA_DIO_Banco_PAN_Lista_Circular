public class ListaCircular<T> {

    private No cabeca;
    private No cauda;
    private int tamanhoLista;

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }
}
