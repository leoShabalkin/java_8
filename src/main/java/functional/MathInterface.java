package functional;

import java.math.BigDecimal;

/**
 * Created by Leonid_Shabalkin on 4/10/2016.
 */
@FunctionalInterface
public interface MathInterface {
    BigDecimal calcMath(BigDecimal value1, BigDecimal value2);
}
