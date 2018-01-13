package theater;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    @Pointcut("execution(* theater.Performance.perform(..))")
    private void perform() {
    }

    @Before("perform()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("perform()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("perform()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("perform()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
