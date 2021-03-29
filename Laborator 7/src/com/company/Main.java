package com.company;

public class Main {

    public static void main(String[] args) {
	Board b = new Board();
	b.generateAllTokens();
	b.printTokenValues();
	b.selectTokensForGame();

	Runnable runnable = new Player("Andreea");
	new Thread(runnable).start();
    }
}
