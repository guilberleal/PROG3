public class Ponto {
    private final double x;
    private final double y;

    public Ponto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Ponto translada(double x, double y) {
        Ponto p = new Ponto(getX() + x, getY() + y);
        return p;
    }

    public Ponto escala(double x) {
        Ponto p = new Ponto(getX() * x, getY() * x);
        return p;
    }

}
