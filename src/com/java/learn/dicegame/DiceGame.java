package com.java.learn.dicegame;

import java.util.Scanner;
import com.java.learn.dicegame.player.*;

public class DiceGame {

Scanner scan = new Scanner(System.in);

private Player p1;
private Player p2;
	
	public void startGame() {
		
		
		System.out.println("Player One, please enter your name:");
		String name1 = scan.nextLine();
		p1 = new Player(name1);
		
		System.out.println("Player Two, please enter your name:");
		String name2 = scan.nextLine();
		p2 = new Player(name2);
		
		int dicep1 = 0;
		int dicep2 = 0;
		
		p1.roll();
		p2.roll();
		
		dicep1 = p1.number;
		System.out.println(p1.name + " rolled " + dicep1);
		
		dicep2 = p2.number;
		System.out.println(p2.name + " rolled " + dicep2);
		
		System.out.println("Lets see who rolled the bigger number");

		
		if (dicep1 > dicep2) {
			System.out.println(p1.name + " got the bigger number");
			System.out.println(p1.name + " is the winner!");
		} 
		
		if (dicep1 < dicep2) {
			System.out.println(p2.name + " got the bigger number");
			System.out.println(p2.name + " is the winner!");
		}

		if (dicep1 == dicep2) {
			System.out.println ("Well it looks like player " + p1.name + " and player " + p2.name + " roll the same number");
			System.out.println ("Then we can call it a draw");
		}
	}
}	
