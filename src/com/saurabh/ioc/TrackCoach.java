package com.saurabh.ioc;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Run for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "From Track coach: " + fortuneService.getFortune();
	}

}
