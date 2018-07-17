package Work.Level1;

public class Iteration {
    public static void main(String[] args) {
        ParametersAndArrays parameters = new ParametersAndArrays();
        for (int i = 0; i < 10; i++) {
            System.out.println(parameters.sumOrMultiplyNot0(i, 5, false));
        }
        int[] numArray = new int[] {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < 10; i++) {
            parameters.sumOrMultiplyNot0(numArray[i], 5, true);
        }
        for (int i : numArray) {
            System.out.println(numArray[i]);
        }

        parameters.iterationArrays2(new int[10]);
    }
}
