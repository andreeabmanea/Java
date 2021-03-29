package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    List<Token> gameTokens;
    Random rand = new Random();
    int nTokens = 5;
    int[][] values;

    public Board() {

        values = new int[nTokens][nTokens];
        gameTokens = new ArrayList<>();

    }

    public void generateAllTokens() {
        for (int i = 0; i < nTokens; i++)
            for (int j = 0; j < nTokens; j++)
                if (i != j)
                    values[i][j] = rand.nextInt(10);
                else values[i][j] = 0;
    }

    public void printTokenValues(){
        for (int i = 0; i < nTokens; i++) {
            for (int j = 0; j < nTokens; j++)
                System.out.print(values[i][j]);
            System.out.println();
        }
    }

    public void selectTokensForGame(){

        int nCopy = nTokens;
        while (nCopy > 0) {
            Token token = new Token();
            token.firstNumber = rand.nextInt(nTokens) + 1;
            token.secondNumber = rand.nextInt(nTokens) + 1;
            while (token.firstNumber == token.secondNumber)
                token.secondNumber = rand.nextInt(nTokens) + 1;
            token.value = values[token.firstNumber - 1][token.secondNumber - 1];
            System.out.println(token.firstNumber + " " + token.secondNumber);
            nCopy--;
            gameTokens.add(token);
        }

        System.out.println(gameTokens);

    }

}
