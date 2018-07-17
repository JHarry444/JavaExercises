package Work.Level1;

public class ParametersAndArrays {

    Integer sum(int a, int b) {
        return a + b;
    }

    Integer sumOrMultiply(int a, int b, boolean sum) {
        if (!sum)
            return a * b;
        return a + b;
    }

    Integer sumOrMultiplyNot0(int a, int b, boolean sum) {
        if (a == 0 && b != 0) {
            return b;
        } else if (b == 0 && a != 0) {
            return a;
        }
        if (!sum)
            return a * b;
        return a + b;
    }

    public void iterationArrays2(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 10);
            System.out.println(numArray[i]);
        }
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = numArray[i] * 10;
            System.out.println(numArray[i]);
        }
    }
}
