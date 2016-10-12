package functional;

import java.math.BigDecimal;

/**
 * Created by Leonid_Shabalkin on 4/10/2016.
 */
@FunctionalInterface
public interface CalcInterface extends MathInterface {
   default BigDecimal calc(BigDecimal value1, BigDecimal value2) {
       if (isNull(value1)){
           return BigDecimal.ZERO;
       }
       return value1.multiply(value2);
   }
    static boolean isNull(BigDecimal value) {
        System.out.println("Interface Null Check");
        return value == null || value.compareTo(BigDecimal.ZERO) == 0;
    }
}
