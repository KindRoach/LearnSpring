package theater;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.HashMap;
import java.util.Map;

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

    @Around("perform()")
    public void watchPerformance(ProceedingJoinPoint pj) {
        takeSeats();
        silenceCellPhones();
        try {
            pj.proceed();
            applause();
        } catch (Throwable throwable) {
            demandRefund();
        }
    }

    Map<String, Integer> songTimes = new HashMap<>();

    @Pointcut("execution(* theater.Performance.sing(String)) && args(songName)")
    private void sing(String songName) {
    }

    @AfterReturning("sing(songName)")
    public void countSong(String songName) {
        int times = songTimes.getOrDefault(songName, 0);
        songTimes.put(songName, times + 1);
    }

    public int getSongTimes(String songName) {
        return songTimes.getOrDefault(songName, 0);
    }
}
