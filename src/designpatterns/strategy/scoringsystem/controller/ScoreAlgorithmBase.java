package designpatterns.strategy.scoringsystem.controller;

public abstract class ScoreAlgorithmBase {
	public abstract int calculateScore(int taps, int multiplier);
}
