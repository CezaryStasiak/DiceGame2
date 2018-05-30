package com.dicegame.player;

import java.util.Random;

public class PlayerComp extends Player {

	public PlayerComp(String name) {
		super(name);
	}

	private Random dice = new Random();

	public int guess() {
		this.guess = dice.nextInt(6) + 1;
		return guess;
	}
}
