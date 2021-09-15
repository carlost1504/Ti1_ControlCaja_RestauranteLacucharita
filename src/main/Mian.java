package main;

import Ui.inicio;
import javafx.application.Application;
import javafx.stage.Stage;

public class Mian extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		inicio init=new inicio();
		System.out.println("entre");
		init.show();
		
	}

}
