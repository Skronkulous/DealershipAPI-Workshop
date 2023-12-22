package com.pluralsight.dealership.app;

import com.pluralsight.dealership.app.ui.Screens;
import com.pluralsight.dealership.dao.connect.DataConnect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {
	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
		Screens.mainMenuFlow();
	}
}