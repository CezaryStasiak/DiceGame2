package com.dicegame.core.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dicegame.player.PlayerComp;

public class GameTest {

	PlayerComp player = new PlayerComp();
	
	@Test
	public void setNameTest() {
		String x = "edek";
		player.setName(x);
		assertTrue(player.getName() == x);
	}

}
