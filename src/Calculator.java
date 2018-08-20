
public class Calculator {
    public static final char ADDITTION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTICATION = '*';
    public static final char DIVITION = '/';

    public static int calculate(int a, int b, char o) {
        switch (o) {
            case ADDITTION:
                return a + b;
            case SUBTRACTION:
                return a - b;
            case MULTICATION:
                return a * b;
            case DIVITION:
                if (b != 0)
                    return a / b;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}