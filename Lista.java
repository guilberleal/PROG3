public class Lista {
    public static class No {
        // variaveis da classe interna
        public String dado;
        public No proximo;

        public No(String dado) {
            this.dado = dado;
            this.proximo = null;
        }

        public String getDados() {
            return dado;
        }

    }

    // variaveis da classe externa
    private No comeco;
    private No fim;

    // construtor
    public Lista() {
        this.comeco = null;
        this.fim = null;
    }

    private boolean vazia() {
        return this.comeco == null;
    }

    private boolean cheio() {
        return this.fim != null;
    }

    // metodo para inserir no fim fila
    public void insere(String dado) {
        No novoNo = new No(dado);
        if (vazia()) {
            this.comeco = novoNo;
            this.fim = novoNo;
        } else {
            this.fim.proximo = novoNo;
            this.fim = novoNo;
        }
    }

    public void remove() {
        if (vazia()) {
            System.out.println("\n[ERRO]A lista esta vazia");
        } else {
            this.comeco = this.comeco.proximo;
        }
    }

}