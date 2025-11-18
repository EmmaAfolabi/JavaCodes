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
}
