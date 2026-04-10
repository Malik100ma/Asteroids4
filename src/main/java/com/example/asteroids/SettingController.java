package com.example.asteroids;

import javafx.event.ActionEvent;

import java.io.IOException;

import com.example.asteroids.GameSettings.*;
public class SettingController {
    public void backSetting(ActionEvent actionEvent) throws IOException {
        AsteroidApplication.setRoot("mainMenu-view");
        System.out.println("Back Menu");
    }

    public void easy(ActionEvent actionEvent) {
GameSettings.getInstance().setAsteroidSpeed(0.1);
    }

    public void medium(ActionEvent actionEvent) {
        GameSettings.getInstance().setAsteroidSpeed(0.2);
    }
    public void hard(ActionEvent actionEvent) {
        GameSettings.getInstance().setAsteroidSpeed(0.3);
    }

}
