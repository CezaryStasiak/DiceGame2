package com.dicegame.player;

public abstract class Player {

	private String name = "No_Name";

	public abstract int guess();

	public String getName() {
		return name;
	}

	public void setName(String name) {

		try {
			if (name.length() < 3 | name.contains(" "))
				throw (new IllegalArgumentException());
			else
				this.name = name;
		} catch (IllegalArgumentException e) {
			System.out.println("Podane imie jest nieprawidlowe!");
			System.out.println("Imie nie moze zawierac spacji i musi miec minimum 3 znaki !");
		};

	}
}
