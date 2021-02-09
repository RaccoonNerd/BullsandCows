package core;
import java.util.Scanner;

public class UI {
	private Answer answer;
		
	public UI(Answer answer) {
		this.answer = answer;
	}
	
	public void run() {
		Scanner in = new Scanner(System.in);
		System.out.println(answer.toString());
		
		int round = 1;
		while(round < 10) {
			System.out.println("Round "+round+" : " );
			String input = in.next();
			while(input.length() != 3) {
				System.out.println("Wrong Input!");
				System.out.println("Round "+round+" : " );
				input = in.next();
			}
			String result = answer.checkAnswer(input.split(""));
			if(result.equals("3S0B")) {
				System.out.println(result);
				System.out.println("You Win!");
				return;
			}else System.out.println(result);
			round++;
		}
		System.out.println("You Failed!");
		return;
	}
	
}
