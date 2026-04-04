package com.example.asteroids;

import javafx.event.ActionEvent;

import java.io.IOException;

public class MainMenuController {
    public void newGame(ActionEvent actionEvent) throws IOException {
AsteroidApplication.setRoot("game-view");
        System.out.println("New Game Started");
    }

    public void settings(ActionEvent actionEvent) throws IOException {
        AsteroidApplication.setRoot("settingMenu-view");
        System.out.println("Setting Open");
    }
}
