import java.util.ArrayList;

public class runnable {

    public static void main(String[] args) {

        ArrayList<Runnable> list = new ArrayList<Runnable>();

        // atribuindo lambda a uma variavel
        Runnable task1 = () -> {

            System.out.println("executando task1");
        };

        Runnable task2 = () -> {
            System.out.println("executando task2");
        };

        // executando lambda
        Runnable task3 = () -> {
            System.out.println("executando task3");
        };

        list.add(task1);
        list.add(task2);
        list.add(task3);

        executar(list);
    }

    public static void executar(ArrayList<Runnable> lista) {
        for (Runnable el : lista) {
            el.run();
        }
    }

}