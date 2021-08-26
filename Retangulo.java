public class Retangulo extends Shape {
    private double largura;
    private double altura;
    private Ponto topLeft;

    public Retangulo(Ponto topLeft, double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
        this.topLeft = topLeft;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public Ponto getTopLeft() {
        return this.topLeft;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setTopleft(Ponto topleft) {
        this.topLeft = topleft;
    }

}
