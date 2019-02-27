package designpatterns.strategy.scoringsystem;

import designpatterns.strategy.scoringsystem.controller.ScoreBoard;
import designpatterns.strategy.scoringsystem.model.Balloon;
import designpatterns.strategy.scoringsystem.model.Clown;
import designpatterns.strategy.scoringsystem.model.SquareBalloon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world");
		
		ScoreBoard scoreboard = new ScoreBoard();
		
		System.out.print("Balloon Tap Score: ");
		scoreboard.model = new Balloon();
		scoreboard.showScore(10, 5);
		
		System.out.print("Clown Tap Score: ");
		scoreboard.model = new Clown();
		scoreboard.showScore(10, 5);
		
		System.out.print("SquareBalloon Score: ");
		scoreboard.model = new SquareBalloon();
		scoreboard.showScore(10, 5);
	}

}
