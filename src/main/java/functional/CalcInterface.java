package functional;

import java.math.BigDecimal;

/**
 * Created by Leonid_Shabalkin on 4/10/2016.
 */
@FunctionalInterface
public interface CalcInterface extends MathInterface {
   default BigDecimal calc(BigDecimal value1, BigDecimal value2) {
       return value1.multiply(value2);
   }
}
