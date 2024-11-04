package Chapter5;

public class BarChart {

    public void printBarChart(int one, int two, int three, int four, int five)
    {
        int counter = 1;
        int value = 0;
        while (counter <= 5)
        {
            if (counter == 1)
                value = one;
            else if (counter == 2)
                value = two;
            else if (counter == 3)
                value = three;
            else if (counter == 4)
                value = four;
            else if (counter == 5)
                value = five;
        }
    }
}
