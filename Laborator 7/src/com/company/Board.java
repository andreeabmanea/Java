package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Board {
    Map<Integer, Integer> pair;
    Random rand = new Random();
    int nTokens = 5;
    int[][] values;

    public Board() {
        pair = new HashMap<>();
        values = new int[nTokens][nTokens];

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
        Token token = new Token();
        int copy = nTokens;
        while (copy >= 0) {
            token.firstNumber = rand.nextInt(nTokens);
            token.secondNumber = rand.nextInt(nTokens);
            while (token.firstNumber == token.secondNumber)
                token.secondNumber = rand.nextInt(nTokens);
            System.out.println(token.firstNumber + " " + token.secondNumber);
            pair.put(token.firstNumber, token.secondNumber);
            copy--;
        }
        System.out.println(pair);
    }

}
