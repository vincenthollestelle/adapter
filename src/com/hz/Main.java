package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        Adapter adapter = new Adapter(reader);

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // read response
        Boolean ans1 = adapter.checkAnswer();

        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}
