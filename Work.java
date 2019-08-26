import java.util.*;
class Work  {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int money;
		if(hour <=40 ) {
			money = hour * 120;
			} else
			money=(hour*120)+((hour%40)*20);
		System.out.println(money);
	}
}