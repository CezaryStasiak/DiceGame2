package com.dicegame.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import com.dicegame.player.Player;

public class Game {

	private ArrayList<Player> listOfPlayers = new ArrayList<Player>();

	public void addPlayer(Player player) {
		listOfPlayers.add(player);
	}

	public void start() {
		Random dice = new Random();
		boolean gameOn = true;
		int number = 0;
		int guess = 0;
		Iterator<Player> list1;

		do {
			
			for (list1 = listOfPlayers.iterator(); list1.hasNext();) {
				Player player = (Player) list1.next();
				guess = player.guess();
				System.out.println("Gracz " + player.getName() + " wylosowal :" + guess);
			}

			number = dice.nextInt(6) + 1;
			System.out.println("Wylosowane: " + number);
			
			for (list1 = listOfPlayers.iterator(); list1.hasNext();) {
				Player player = (Player) list1.next();
				guess = player.getGuess();
				if (guess == number) {
					System.out.println("Gracz " + player.getName() + " trafil !");
					gameOn = false;
				}
			}
			
		} while (gameOn);

	}

}
