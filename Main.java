import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<novo> imovelnovo = new ArrayList<>();
        ArrayList<velho> imovelVelho = new ArrayList<>();

        imovelnovo.add(new novo("rua 2", 600, 10));
        imovelVelho.add(new velho("Rua 20", 600, 10));

        for (novo f : imovelnovo) {
            System.out.printf("\nNOVO Endereco: %s\nNOVO Preco: %.1f", f.getEndereco(), f.getPreco());
            f.imprimeAdicional();
        }
        for (velho g : imovelVelho) {
            System.out.printf("\nVELHO Endereco: %s\nVELHO Preco: %.1f", g.getEndereco(), g.getPreco());
            g.imprimeDesconto();
        }

    }
}
