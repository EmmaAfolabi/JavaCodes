package chapter4;

public class TabularOutput {

    public static void main(String[] args) {

        int counter = 1;
        System.out.println("N\tN^2\tN^3\tN^4");
        System.out.println();
        while (counter <= 5){
            System.out.printf("%d\t%d\t%d\t%d%n", counter * 1, counter * counter, counter * counter * counter, counter * counter * counter * counter);
            counter++;
        }
    }
}
