package com.saurabh.ioc;

public class CricketCoach implements Coach {

	private String emailAddress;
	private String name;
	private FortuneService fortuneService;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
