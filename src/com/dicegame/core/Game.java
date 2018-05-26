package com.dicegame.core;

import java.util.Random;
import java.util.Scanner;

import com.dicegame.player.Player;

public class Game {

	private Player player;
	
	public void addPlayer(Player player){
		this.player = player;
	}
	
	public void start(){
		Random dice = new Random();
		Scanner sc = new Scanner(System.in);

		int number, guess = 1;

		System.out.println("Podaj imie dla gracza :");

		player.setName(sc.nextLine());
		
		do {
			number = dice.nextInt(6) + 1;
			System.out.println("Wylosowane: " + number);

			guess = player.guess();

			System.out.println("Gracz " + player.getName() + " wylosowal :" + guess);

			if (number != guess) {
				System.out.println("ŹLE!");
			} else {
				System.out.println("DOBRZE!");
			}

		} while (number != guess);
	
	}
	
}
