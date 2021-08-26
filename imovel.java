public class imovel {
    private String endereco;
    private double preco;

    // construtor
    public imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    // gets
    public String getEndereco() {
        return this.endereco;
    }

    public double getPreco() {
        return this.preco;
    }

    // sets
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}