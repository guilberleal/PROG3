public class novo extends imovel {
    private double adicional;

    // construtor
    public novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
        preco += (preco * (adicional / 100));
        setPreco(preco);
    }

    // gets
    public double getAdicional() {
        return this.adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    // imprime adicional
    public void imprimeAdicional() {
        System.out.printf("\nValor Adicional = %.1f", getAdicional());
    }

    // imprime o imovel
    public void imprimeImovel() {
        System.out.printf("\nEndereco: %s\nPreco: %f", getEndereco(), getPreco());
    }
}