
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        // criando o arrayList
        int TAM = 100;
        ArrayList<String> palavra = new ArrayList<>(List.of("Bailarina", "Futebol", "Estátua", "Pintor", "Frio", "Bebê",
                "Mímico", "dentes", "Lápis", "Livro", "Astronauta", "Amor", "Ódio", "Cego", "Cadeira", "Sacola",
                "Professor", "Médico", "Calculadora", "Artista", "Vitória", "Pescador", "Internet", "Basquete",
                "Semente", "Policial", "Amargo", "Bilhete", "Xadrez", "Banana", "Micróbio", "Romance", "Carteira",
                "lavar", "surfe", "Debate", "Lixo", "Sombra", "Cadeado", "Massagem", "Chefão", "Fiction", "Espaço",
                "Estrelas", "Gump", "Americana", "Mecânica", "Iluminado", "Luta", "Psicose", "Park", "Driver", "Trevas",
                "Crepúsculo", "Poulain", "Leão", "Matrix", "Adormecida", "Fantasmas", "Dumbo", "Rocky", "Aluguel",
                "Vagabundo", "Cego", "ET", "Borboleta", "Cavalo", "Cachorro", "Caranguejo", "Chimpanzé", "Coelho",
                "Jacaré", "Elefante", "Galinha", "Girafa", "Leão", "Gato", "Sapo", "Veado", "Tigre", "Grilo", "Formiga",
                "Abelha", "Hipopótamo", "Golfinho", "Tigre", "Capivara", "Esquilo", "Rato", "Porco", "Maca", "Templo",
                "Cápsula", "Estrada", "Planeta", "Corno", "GOMO", "Estrela", "Trem", "Infinito"));

        ArrayList<String> palavra2 = new ArrayList<>();
        String temporario = "";
        int quebralinha = 0;

        Random gerador = new Random();
        gerador.nextInt(TAM);
        for (int i = 0; i < 200; i++) {
            temporario = "-" + palavra.get(gerador.nextInt(TAM)) + " " + palavra.get(gerador.nextInt(TAM)) + " ";
            palavra2.add(temporario);
        }
        for (int i = 0; i < 200; i++) {

            System.out.printf(palavra2.get(i));
            if (quebralinha == 20) {
                System.out.printf("\n *");
                quebralinha = 0;
            }
            quebralinha++;
        }

    }
}
