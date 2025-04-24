package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = -10;
		if(a > b) {
			boolean answer = true;
			System.out.println(answer);
		}else {
//			boolean answer = false;
			System.out.println("false");
		}
		String sunny = "sunny";
		String warm = "warm";
		boolean isSunny = (sunny == "sunny");
		boolean isWarm = (warm == "warm");
		if(isSunny && isWarm) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		int x =10;
		int y = 8;
		if(x > 0 && y % 2 == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		boolean hasPermission =! (a < b);
		System.out.println(hasPermission);
	}

}
