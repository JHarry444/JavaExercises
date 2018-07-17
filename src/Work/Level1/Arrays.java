package Work.Level1;

public class Arrays {

    public static void main(String[] args) {
        int[] numArray = new int[] {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < 10; i++) {
            sumOrMultiplyNot0(numArray[i], 5, true);
        }
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
//        iterationArrays2(new int[10]);
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

    private static void iterationArrays2(int[] numArray) {
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
