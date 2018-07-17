package Work.Level1;

public class Conditionals {
    public static void main(String[] args) {
        sumOrMultiply(2, 4, true);
    }

    private static Integer sumOrMultiply(int a, int b, boolean sum) {
        if (!sum)
            return a * b;
        return a + b;
    }

    private static Integer sumOrMultiplyNot0(int a, int b, boolean sum) {
        if (a == 0 && b != 0) {
            return b;
        } else if (b == 0 && a != 0) {
            return a;
        }
        if (!sum)
            return a * b;
        return a + b;
    }
}
