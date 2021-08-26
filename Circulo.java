public class Circulo extends Shape {
    private double raio;
    private Ponto centro;

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public Ponto getCentro() {
        return this.centro;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }
}
