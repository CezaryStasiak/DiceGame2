package com.dicegame.core;

import com.dicegame.player.PlayerComp;
import com.dicegame.player.PlayerDumb;

public class DiceGame {

	public static void main(String[] args) {

		Game game = new Game();

		game.addPlayer(new PlayerComp("Komputer1"));
		game.addPlayer(new PlayerComp("Komputer2"));
		game.addPlayer(new PlayerDumb("Szczesciaz"));

		game.start();

	}
}
