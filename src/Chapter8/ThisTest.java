package Chapter8;
// this used implicitly and explicitly to refer to members of an object

public class ThisTest {
    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

// class SimpleTime demonstrate the "this" reference
class SimpleTime {
    private int hour; // 0-23
    private int minute; // 0-59
    private int second; // 0-59

    // if the constructor uses parameter names identical to
    // instance variable names the "this" reference is
    // required to distinguish between the names
    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour; // set "this"  object's hour
        this.minute = minute; // set "this"  object's minute
        this.second = second; // set "this" object's second
    }

    // use explicit  and implicit "this" to call toUniversalString
    public String buildString() {
        return String.format("%24s: %s%n%24s: %s",
                "this.toUniversalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    }

    // convert to String in universal-time format (HH:MM:SS)

}
