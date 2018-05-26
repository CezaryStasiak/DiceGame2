package com.dicegame.core;

import com.dicegame.player.PlayerComp;

public class DiceGame {

	public static void main(String[] args) {

		Game game = new Game();
		
		game.addPlayer(new PlayerComp());
		
		game.start();
		

}
}
