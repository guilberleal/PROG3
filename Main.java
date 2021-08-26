public class Main {
    public static void main(String[] args) throws Exception {
        Ponto p = new Ponto(3, 4);
        Ponto p2 = p.translada(1, 3);
        Ponto p3 = p.translada(1, 3).escala(0.5);

        System.out.println(p.getX() + " " + p.getY());
        System.out.println(p2.getX() + " " + p2.getY());
        System.out.println(p3.getX() + " " + p3.getY());

    }
}
