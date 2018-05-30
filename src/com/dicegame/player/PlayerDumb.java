package com.dicegame.player;

public class PlayerDumb extends Player {

	public PlayerDumb(String name) {
		super(name);
	}

	public int guess() {
		this.guess = 6;
		return guess;
	}

}
