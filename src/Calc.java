import java.util.List;

public class Calc {

    public String count(String s, int x, int y) {
        // for add last condition need return string
        if (s.contains("+"))
            return add(x, y) + "";
        else if (s.contains("-"))
            return subtract(x, y) + "";
        else if (s.contains("*"))
            return multiply(x, y) + "";
        else if (s.contains("/"))
            return divide(x, y) + "";
        else return "Not expression";

    }

    private int add(int x, int y) {
        return x + y;
    }

    private int subtract (int x, int y) {
        return x - y;
    }

    private int multiply (int x, int y) {
        return x * y;
    }

    private int divide  (int x, int y) {
        return x / y;
    }

}