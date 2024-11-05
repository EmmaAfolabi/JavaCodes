package Chapter5;

public class ChristmasSong {

    public void displayChristmasSong() {
        int days = 1;

        while (days <= 12) {
            switch (days) {
                case 1:
                    System.out.println("On the first day of Christmas my true love sent to me");
                    break;
                case 2:
                    System.out.println("On the second day of Christmas my true love sent to me");
                    break;
                case 3:
                    System.out.println("On the third day of Christmas my true love sent to me");
                    break;
                case 4:
                    System.out.println("On the fourth day of Christmas my true love sent to me");
                    break;
                case 5:
                    System.out.println("On the fifth day of Christmas my true love sent to me");
                    break;
                case 6:
                    System.out.println("On the sixth day of Christmas my true love sent to me");
                    break;
                case 7:
                    System.out.println("On the seventh day of Christmas my true love sent to me");
                    break;
                case 8:
                    System.out.println("On the eighth day of Christmas my true love sent to me");
                    break;
                case 9:
                    System.out.println("On the ninth day of Christmas my true love sent to me");
                    break;
                case 10:
                    System.out.println("On the tenth day of Christmas my true love sent to me");
                    break;
                case 11:
                    System.out.println("On the eleventh day of Christmas my true love sent to me");
                    break;
                case 12:
                    System.out.println("On the twelfth day of Christmas my true love sent to me");
            }

            switch (days) {
                case 12:
                    System.out.println("twelve drummers drumming");
                    break;
                case 11:
                    System.out.println("eleven pipers piping");
                    break;
                case 10:
                    System.out.println("ten lords a-leaping");
                    break;
                case 9:
                    System.out.println("nine ladies dancing");
                    break;
                case 8:
                    System.out.println("eight maids a-milking");
                    break;
                case 7:
                    System.out.println("seven swans a-swimming");
                    break;
                case 6:
                    System.out.println("six geese a-laying");
                    break;
                case 5:
                    System.out.println("five gold rings");
                    break;
                case 4:
                    System.out.println("four calling birds");
                    break;
                case 3:
                    System.out.println("Three French hens");
                    break;
                case 2:
                    System.out.println("Two turtle doves");
                    break;
                case 1:
                    System.out.println("And a partridge in a pear tree");
            }
            System.out.println();
            days++;
        }
    }
}
