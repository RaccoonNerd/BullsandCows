package main;

import core.Answer;
import core.UI;

public class Main {

	public static void main(String[] args) {
		Answer answer = new Answer(3);
		UI ui = new UI(answer);
		ui.run();
	}

}
