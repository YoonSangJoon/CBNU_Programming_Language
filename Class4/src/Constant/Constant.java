package Constant;

public class Constant {

	public static void main(String[] args) {
		
		// 상수를 만드는 방법
		
		final double KM_PER_MILE = 1.609344;
		double km;
		double mile = 60.0;
		km = KM_PER_MILE * mile;
		
		System.out.println("60마일은 " + km + "킬로미터 입니다.");

	}

}
