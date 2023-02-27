package ExercicioLampada;

import java.util.Random;

public class LampadaTest {
    public static void main(String[] args) {
        Lampada l1 = new Lampada(true);
        Lampada l2 = new Lampada(false);

        System.out.println("Lampada 1 está agora: " + (l1.getEstado() ? "ligada" : "desligada"));
        System.out.println("Lampada 2 está agora: " + (l2.getEstado() ? "ligada" : "desligada"));

        Random random = new Random();
        boolean estadoRandom = random.nextBoolean();
        Lampada l3 = new Lampada(estadoRandom);

        estadoRandom = random.nextBoolean();
        Lampada l4 = new Lampada(estadoRandom);

        System.out.println("Lampada 3 está agora: " + (l3.getEstado() ? "ligada" : "desligada"));
        System.out.println("Lampada 4 está agora: " + (l4.getEstado() ? "ligada" : "desligada"));
    }
}
