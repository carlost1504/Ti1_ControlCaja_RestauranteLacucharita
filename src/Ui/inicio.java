package Ui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class inicio extends Stage {
	
	 
	 private Button Bt_enter;
	 
	 public inicio() {
		 System.out.println("aqui voy ");
			try {
				FXMLLoader loader=new FXMLLoader(getClass().getResource("inicio.fxml"));
				Parent root=loader.load();
				Bt_enter=(Button)loader.getNamespace().get("Bt_enter");
				System.out.println("aqui voy entre");
				Scene scene=new Scene(root,600,500);
				setScene(scene);
				action();
			} catch (IOException e) {
				e.printStackTrace();
			}
	 }
	 public void action() {
		
		Bt_enter.setOnAction(Event->{
			inicio p=new inicio();
			validation_User m=new validation_User();
			m.show();
			p.close();
		});
	 }
	 
}
