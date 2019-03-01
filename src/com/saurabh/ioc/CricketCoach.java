package com.saurabh.ioc;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Bowl 20 overs";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket is fun. Enjoy!";
	}

}
