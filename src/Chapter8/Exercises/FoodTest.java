package Chapter8.Exercises;

enum Food {

    APPLE("Fruit", 95),
    BANANA("Fruit", 105),
    CARROT("Vegetable", 25);

    private final String type;
    private final int calories;

    Food(String type, int calories) {
        this.type = type;
        this.calories = calories;
    }

    public String getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }

    public void displayInfo() {
        System.out.printf("%-10s | Type: %-10s | Calories: %d%n",
                this.name(), type, calories);
    }
}

public class FoodTest {

    public static void main(String[] args) {

        System.out.println("=== Food Enum Information ===\n");

        System.out.println("Using values() method");
        System.out.println("-------------------------------------------");

        for (Food food : Food.values()) {
            food.displayInfo();
        }
        System.out.println("\n");

        System.out.println("Accessing individual constants");
        System.out.println("-------------------------------------------");

        Food apple = Food.APPLE;
        System.out.println("Name: " + apple.name());
        System.out.println("Type: " + apple.getType());
        System.out.println("Calories: " + apple.getCalories());

        System.out.println();

        Food banana = Food.BANANA;
        System.out.println("Name: " + banana.name());
        System.out.println("Type: " + banana.getType());
        System.out.println("Calories: " + banana.getCalories());

        System.out.println();

        Food carrot = Food.CARROT;
        System.out.println("Name: " + carrot.name());
        System.out.println("Type: " + carrot.getType());
        System.out.println("Calories: " + carrot.getCalories());

        System.out.println("\n");

        System.out.println("Formatted table display");
        System.out.println("-------------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s%n", "Food", "Type", "Calories");
        System.out.println("-------------------------------------------");

        for (Food food : Food.values()) {
            System.out.printf("%-10s | %-10s | %-10d%n",
                    food.name(), food.getType(), food.getCalories());
        }

        System.out.println("-------------------------------------------");

        System.out.println("\nUsing enum comparison");
        System.out.println("-------------------------------------------");

        Food myfood = Food.BANANA;
        System.out.println("My favorite food is: " + myfood);

        if (myfood.getType().equals("Fruit")) {
            System.out.println(myfood.name() + " is a fruit!");
        }

        System.out.println("\nTotal number of Food constants: " + Food.values().length);
    }
}
