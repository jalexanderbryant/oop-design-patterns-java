package designpatterns.strategy.scoringsystem.model;

import designpatterns.strategy.scoringsystem.controller.ScoreAlgorithmBase;

public class SquareBalloon extends ScoreAlgorithmBase {

	@Override
	public int calculateScore(int taps, int multiplier) {
		// TODO Auto-generated method stub
		return (taps * multiplier) + 40;
	}

}
