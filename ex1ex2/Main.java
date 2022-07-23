package Lab108.ex1ex2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {


        BigDecimal a = new BigDecimal(4.2545);
        System.out.println(ex1(a));
        System.out.println(ex2(a));


    }

    public static double ex1(BigDecimal a) {
        return a.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    public static BigDecimal ex2(BigDecimal b) {
        return b.setScale(1, RoundingMode.HALF_EVEN).negate();
    }
}
