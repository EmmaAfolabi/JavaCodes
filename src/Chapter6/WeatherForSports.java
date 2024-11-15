package Chapter6;

public class WeatherForSports {

    // Method to recommend sports activity based on temperature
    public static String sportsRecommender(int temperature) {
        if (temperature >= 20 && temperature <= 30) {
            return "It's lovely weather for sports today!";
        } else if (temperature >= 10 && temperature <= 40) {
            return "It's reasonable weather for sports today.";
        } else {
            return "Please exercise with care today, watch out for the weather!";
        }
    }

    public static void main(String[] args) {

    }
}
