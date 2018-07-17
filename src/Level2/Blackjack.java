package Level2;

public class Blackjack {

    public int blackjack(int a, int b ) {
        if (a > 21 && b < 22)
            return b;
        else if (b > 21 && a < 22)
            return a;
        if (21 - a > 21 - b)
            return b;
        else
            return a;

    }
}
