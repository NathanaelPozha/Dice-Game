package com.java.learn.dicegame.player;

import com.java.learn.dicegame.player.dice.Dice;

public class Player {
	public String name;
	public int number = 0;
	Dice dice;
	
	public Player(String playerName) {
        name = playerName;
        dice = new Dice();
    }
	
	public void roll() {
		dice.diceRoll();
		number = dice.getResult();
		System.out.println(name +" is rolling...");
	}

	//getName();
	//setName();
	//getNumber();
	//setNumber();

}