public abstract class Shape {
    Ponto a;

    public Shape(Ponto a) {
        this.a = a;
}

Ponto vPonto = new Ponto(10, 20);

public void moveBy(double dx, double dy);

public abstract Ponto getCentro();
