public class velho extends imovel {
    private double desconto;

    // construtor
    public velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
        preco -= (preco * (desconto / 100));
        setPreco(preco);
    }

    // gets
    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    // imprime desconto
    public void imprimeDesconto() {
        System.out.printf("\nValor desconto = %.1f", getDesconto());
    }

    // imprime o imovel
    public void imprimeImovel() {
        System.out.printf("\nEndereco: %s\nPreco: %f", getEndereco(), getPreco());
    }

}