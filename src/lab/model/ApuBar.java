package lab.model;

import lab.aop.AopLog;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

public class ApuBar implements Bar {

    //@Around("execution(* sellSquishee(..))")
    public Squishee sellSquishee(Customer customer)  {
        System.out.println("I am executing sellSquishee itself!");
        if (customer.isBroke()){
            throw new CustomerBrokenException();
        }
        AopLog.append("Here is your Squishee \n");
        System.out.println(AopLog.getStringValue());
        return new Squishee("Usual Squishee");
    }

}