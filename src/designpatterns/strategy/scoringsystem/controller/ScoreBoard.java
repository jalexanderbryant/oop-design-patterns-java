package designpatterns.strategy.scoringsystem.controller;

public class ScoreBoard {
	public ScoreAlgorithmBase model;
	
	public void showScore(int taps, int multiplier) {
		System.out.println(model.calculateScore(taps, multiplier));
	}
}
