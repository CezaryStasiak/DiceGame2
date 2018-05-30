package com.dicegame.player;

import java.util.Scanner;

public class PlayerHuman extends Player {

	public PlayerHuman(String name) {
		super(name);
	}

	private Scanner scanner = new Scanner(System.in);

	public int guess() {
		System.out.print("Podaj liczbę: ");
		this.guess = scanner.nextInt();
		return guess;
	}
}
