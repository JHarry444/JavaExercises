package Work.Level1;

public class Iteration {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            sumOrMultiplyNot0(i, 5, true);
        }
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
