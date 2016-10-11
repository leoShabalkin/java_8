package functional;

import org.apache.commons.lang.math.NumberUtils;

import java.math.BigDecimal;

/**
 * Created by Leonid_Shabalkin on 4/10/2016.
 */
public class FunctionalExample {
    public static void main(String[] args) {
        // sample
        SampleInterface sampleInterface = (name) -> System.out.println("Hello, " + name);
        sampleInterface.say("Test");

        // is number
        IsNumberInterface isNumberInterface = NumberUtils::isNumber;
        System.out.println(isNumberInterface.check("0"));
        System.out.println(isNumberInterface.check("i"));

        // calc
        CalcInterface calcInterface = BigDecimal::add;
        System.out.println(calcInterface.calc(new BigDecimal(10.0), new BigDecimal(20.0)));
        System.out.println(calcInterface.calcMath(new BigDecimal(10.0), new BigDecimal(20.0)));

        GetInterface<DoSomethingInterface> getInterface = ()->()->System.out.println("Hello");
        DoSomethingInterface doSomethingInterface = getInterface.get();
        doSomethingInterface.doSomething();
    }
}
