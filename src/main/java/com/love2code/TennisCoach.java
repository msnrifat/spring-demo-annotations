package com.love2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    public TennisCoach() {
        System.out.println("default constructor");
    }

    /*@Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("doSomeCrazyStuff is called");
    }*/

    @Override
    public String getDailyWorkout() {
        return "Playing some Tennis";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
