package com.example.anna_.bombcharades;

import java.util.Vector;

/**
 * Created by anna_ on 12/31/2016.
 */

public class Dictionary {

    public Vector<String> wordList;

    Dictionary(Vector<String> wordList){
        this.wordList = wordList;
    }

    public void initWordList(){
        wordList.add("California");
        wordList.add("LLNL");
        wordList.add("Horses");
        wordList.add("CPU");
        wordList.add("Caffeine");
        wordList.add("Cellphone");
    }
}
