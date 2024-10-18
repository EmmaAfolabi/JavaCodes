package chapter4;

public class Cryptography {
    public String encryptNumber(int digits) {
        int value1 =0, value2 =0, value3 =0, value4 =0;

        value4 = (digits % 10 + 7) % 10;
        digits /= 10;
        value3 = (digits % 10 + 7) % 10;
        digits /= 10;
        value2 = (digits % 10 + 7) % 10;
        digits /= 10;
        value1 = ( digits % 10 + 7) % 10;
    }
}
