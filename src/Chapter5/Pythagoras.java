package Chapter5;

public class Pythagoras {

    public void checkTriples() {

        System.out.printf("%s%10s%15s%n", "Side1", "Side2", "Hypotenus");
        int side1, side2, hypotenus;
        for (int a = 1; a <= 500; a++) {
            side1 = a * a;
            for (int b = 1; b <= 500; b++) {
                side2 = b * b;
            }
                for (int c = 1; c <= 500; c++) {
                    hypotenus = c * c;
                }
        }
    }
}
