package Level2;

public class UniqueSum {

    public int uniqueSum(int a, int b, int c) {
        int result = a;
        if ( b != a && b!= c)
            result += b;
        if (c != a && c != b)
            result += c;
        return result;
    }
}
