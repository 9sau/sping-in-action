package com.saurabh.ioc;

public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;

	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend some time on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
