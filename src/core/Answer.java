package core;
import java.util.Random;

public class Answer {
	private String[] answer;
	private int length;

	public Answer(int length) {
		this.answer = new String[length];
		this.length = length;
		Random random = new Random();
		
		for(int i = 0; i<length; i++) {
			String temp = Integer.toString(random.nextInt(8) + 1);
			answer[i] = temp;
			for(int j= i-1; j >= 0; j--){
				if(answer[j].equals(temp)) {
					i--;
					break;
				}
			}
		}
		
	}

	public Answer(int length, String[] number) {
		this.length = length;
		for(int i = 0;i<length; i++) {
			answer[i] = number[i];
		}
	}
	
	public String toString() {
		String temp = "";
		for(int i = 0; i<length; i++) {
			temp += answer[i];
		}
		return temp;
	}
	
	public String[] getAnswer() {
		return answer;
	}
	
	public String checkAnswer(String[] number) {
		int strike = 0;
		int ball = 0;
		
		for(int i = 0; i<length; i++) {
			for(int j = 0; j< length; j++) {
				if(answer[i].equals(number[j])){
					if(i == j) strike++;
					else ball++;
					break;
				}
				
			}
		}
		return strike +"S" + ball + "B";
	}
	
}
