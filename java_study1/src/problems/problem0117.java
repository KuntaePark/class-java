package problems;

public class problem0117 {
	/*
	 * 담배 한 개피에 수명이 2분 단축된다.
	 * 어떤 사람이 담배를 20년 피웠다.
	 * 이 사람이 하루에 몇개피 피우는지 
	 * 
	 * 이 사람의 단축된 수명이 총 몇분인가? 출력
	 * 이 사람의 단축된 수명이 총 몇시간인가? 출력
	 * 이 사람의 단축된 수명이 총 몇일인가? 출력
	 */
	
	public static void main(String[] args) {
		int perSmokeLife = 2;
		int years = 20;
		
		int smokePerDay = 5;
		
		int reducedLifeMin = years * 365 * smokePerDay * perSmokeLife;
		int reducedLifeHrs = reducedLifeMin / 60;
		int reducedLifeDays = reducedLifeHrs / 24;
		
		System.out.println("Your Life is reduced by:" + reducedLifeMin + " minutes.");
		System.out.println("Your Life is reduced by:" + reducedLifeHrs + " hours");
		System.out.println("Your Life is reduced by:" + reducedLifeDays + " Days.");
	}
}
