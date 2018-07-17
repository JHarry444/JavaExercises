package Level2;

public class TooHot {

    public boolean isTooHot(int temperature, boolean isSummer) {
        if (isSummer && temperature >= 60 && temperature <= 100)
            return true;
        else if (!isSummer && temperature >= 60 && temperature <= 90)
            return true;
        return  false;
    }
}
