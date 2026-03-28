package com.example.asteroids;

import javafx.event.ActionEvent;

import java.io.IOException;

public class SettingController {
    public void backSetting(ActionEvent actionEvent) throws IOException {
        AsteroidApplication.setRoot("mainMenu-view");
        System.out.println("Back Menu");
    }
}
