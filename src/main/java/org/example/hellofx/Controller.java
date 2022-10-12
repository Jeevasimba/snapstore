package org.example.hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML Label helloLabel;

    String[] greetings = {"Hello", "I", "am", "pradeep"};
    int currentGreetingIndex = 0;

    public void changeGreeting() {
        currentGreetingIndex = (currentGreetingIndex + 1) % greetings.length;
        helloLabel.setText(greetings[currentGreetingIndex]);
    }
}
