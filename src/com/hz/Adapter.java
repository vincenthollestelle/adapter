package com.hz;

import java.io.Console;
import java.util.Arrays;

public class Adapter {

    private ConsoleReader reader;

    public Adapter(ConsoleReader reader) {
        this.reader = reader;
    }

    public Boolean checkAnswer() {
        String[] goodAnswers = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        return Array.asList(goodAnswers).contains(this.reader.readLine());
   }
}